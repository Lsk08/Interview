package cn.codc;

import cn.constant.Constant;
import cn.model.Request;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 *
 * <pre>
 * 数据包格式
 * +——----——+——-----——+——----——+——----——+——-----——+
 * | 包头	| 模块号  | 命令号 |  长度  |   数据  |
 * +——----——+——-----——+——----——+——----——+——-----——+
 * </pre>
 * 包头4字节
 * 模块号2字节short
 * 命令号2字节short
 * 长度4字节(描述数据部分字节长度)
 *
 *
 */
/**
 * Created by yuan on 2018/3/14.
 */
public class RequestEncoder extends OneToOneEncoder {
    @Override
    protected Object encode(ChannelHandlerContext channelHandlerContext, Channel channel, Object o) throws Exception {
        Request request=(Request)o;

        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
        buffer.writeInt(Constant.FLAG);//版本号
        buffer.writeShort(request.getModule());//模块号
        buffer.writeShort(request.getCmd());//命令号
        buffer.writeInt(request.getDataLength());//长度

        if(request.getData()!=null){
            buffer.writeBytes(request.getData());//数据
        }

        return buffer;
    }
}
