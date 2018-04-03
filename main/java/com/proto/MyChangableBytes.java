package com.proto;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

/**
 * Created by yuan on 2018/3/14.
 */
public class MyChangableBytes {

    public static void main(String[] args) {
        //一个int固定占用4个字节
//                ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
//                buffer.writeInt(101);
//                System.out.println(buffer.writerIndex());

                //判断长度 然后调整
//                ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
//                int i=1000000;
//                if(i<0xff){
//                    buffer.writeShort(i);
//                    System.out.println(buffer.writerIndex());
//                }else{
//                    buffer.writeInt(i);
//                    System.out.println(buffer.writerIndex());
//                }

    }
}
