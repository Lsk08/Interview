package mynetty.sticky;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * Created by yuan on 2018/3/15.
 */
public class PrintHandler extends SimpleChannelHandler {

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {

        ChannelBuffer buffer=(ChannelBuffer) e.getMessage();

        byte[] data=buffer.array();

        System.out.println(new String(data));

        super.messageReceived(ctx, e);
    }
}
