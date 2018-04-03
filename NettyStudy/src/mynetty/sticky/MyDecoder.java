package mynetty.sticky;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * Created by yuan on 2018/3/15.
 */
//FrameDecoder的decode 可以做到return null的时候表示等待数据包
    //而继承一般的handler则表示直接清空数据
    //FrameDecoder + Buffer的index操作 是分包粘包的关键
public class MyDecoder extends FrameDecoder {
    @Override
    protected Object decode(ChannelHandlerContext channelHandlerContext, Channel channel, ChannelBuffer channelBuffer) throws Exception {

        if(channelBuffer.readableBytes()>4){
            //标记读取索引
            channelBuffer.markReaderIndex();

            int len=channelBuffer.readInt();

            if(channelBuffer.readableBytes()<len){
                //还原读索引
                channelBuffer.resetReaderIndex();

                //return null表示继续等待，并且缓存当前buffer数据
                return null;
            }

            byte[] data=new byte[len];
            channelBuffer.readBytes(data);

            return new String(data);

        }

        //return null表示继续等待，并且缓存当前buffer数据
        return null;
    }
}
