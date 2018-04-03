package mynetty.sticky;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * Created by yuan on 2018/3/15.
 */

//每个handle只被这个pipeline持有  并且每次都是单线程执行的pipeLine
public class PrintHanlder2 extends SimpleChannelHandler {

    //单线程 安全
    private int count;

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {

        count++;

        String s=(String) e.getMessage();

        System.out.println(s);
        System.out.println(count);

        super.messageReceived(ctx, e);
    }
}
