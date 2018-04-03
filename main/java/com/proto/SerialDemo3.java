package com.proto;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import java.util.Arrays;

/**
 * Created by yuan on 2018/3/14.
 */
public class SerialDemo3 {

    public static void main(String[] args) {
        //nio的dynamic buffer 也就是没有 内容截断 和 容量的问题
        //但是功能不全  例如没有writeString writeObject 也就是只能写定容的东西
        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
        buffer.writeInt(101);
        buffer.writeDouble(80.1);


        byte[] bytes = new byte[buffer.writerIndex()];
        buffer.readBytes(bytes);

        System.out.println(Arrays.toString(bytes));

        "abc".getBytes();

        //================================================
        ChannelBuffer wrappedBuffer = ChannelBuffers.wrappedBuffer(bytes);
        System.out.println(wrappedBuffer.readInt());
        System.out.println(wrappedBuffer.readDouble());

    }
}
