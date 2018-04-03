package cn.codc;

import cn.constant.Constant;
import cn.model.Request;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * Created by yuan on 2018/3/14.
 */
//Decoder需要解决分包、粘包问题
public class RequestDecoder extends FrameDecoder {

    public static int BASE_LENGTH=4+2+2+4;

    @Override
    protected Object decode(ChannelHandlerContext channelHandlerContext, Channel channel, ChannelBuffer channelBuffer) throws Exception {

        int beginIndex=channelBuffer.readerIndex();

        //根据长度判断是否完整
        if(channelBuffer.readableBytes()>BASE_LENGTH){

            if(channelBuffer.readableBytes()>2048){
                channelBuffer.skipBytes(channelBuffer.readableBytes());
            }

            while(true){
                if(channelBuffer.readInt()== Constant.FLAG){
                    break;
                }
            }

            short module=channelBuffer.readShort();
            short cmd=channelBuffer.readShort();
            int length=channelBuffer.readInt();

            if(channelBuffer.readableBytes()<length){
                //移回读指正
                channelBuffer.readerIndex(beginIndex);
                return null;

            }

            byte[] data=new byte[length];
            channelBuffer.readBytes(data);

            Request request=new Request();
            request.setModule(module);
            request.setCmd(cmd);
            request.setData(data);
            //继续向下传递
            return request;


        }

        //null表示长度不完整
        return null;
    }


}
