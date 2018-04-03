package com.proto;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

/**
 * Created by yuan on 2018/3/14.
 */
public class MySerialDemo {

    public static void main(String[] args) {
       //写
//        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
//        buffer.writeInt(101);
//        buffer.writeDouble(80.1);
//
//        //读  先读到bytes 再用一个buffer wrap 再读取内容
//        byte[] bytes = new byte[buffer.writerIndex()];
//        buffer.readBytes(bytes);
//
//        ChannelBuffer wrappedBuffer = ChannelBuffers.wrappedBuffer(bytes);
//        System.out.println(wrappedBuffer.readInt());
//        System.out.println(wrappedBuffer.readDouble());

        //写string
        String s="abc";
        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
        buffer.writeInt(s.length());
        buffer.writeBytes(s.getBytes());

        byte[] bytes = new byte[buffer.writerIndex()];
        buffer.readBytes(bytes);

        ChannelBuffer wrappedBuffer = ChannelBuffers.wrappedBuffer(bytes);
        int len=wrappedBuffer.readInt();
        System.out.println(len);
        byte[] bytes2=new byte[len];
        wrappedBuffer.readBytes(bytes2);
        String ss=new String(bytes2);
        System.out.println(ss);

        //int s=98;
//        String s="s";
//        System.out.println((1==1)?s:7.8);
        short sss=3;sss+=3;
        System.out.println(sss);
    }
}
