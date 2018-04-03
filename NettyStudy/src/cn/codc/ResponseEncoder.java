package cn.codc;

import cn.constant.Constant;
import cn.model.Response;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 * Created by yuan on 2018/3/14.
 */
public class ResponseEncoder extends OneToOneEncoder {
    @Override
    protected Object encode(ChannelHandlerContext channelHandlerContext, Channel channel, Object o) throws Exception {
        Response response=(Response)o;

        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
        buffer.writeInt(Constant.FLAG);//版本号
        buffer.writeShort(response.getModule());//模块号
        buffer.writeShort(response.getCmd());//命令号
        buffer.writeInt(response.getStateCode());//返回码
        buffer.writeInt(response.getDataLength());//长度

        if(response.getData()!=null){
            buffer.writeBytes(response.getData());//数据
        }

        return buffer;
    }
}
