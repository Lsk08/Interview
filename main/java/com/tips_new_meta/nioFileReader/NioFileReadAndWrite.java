package com.tips_new_meta.nioFileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by yuan on 2018/4/23.
 */
public class NioFileReadAndWrite {


    public static void main(String[] args) throws Exception {

        //read file
//        byte[] bytes=Files.readAllBytes(Paths.get("d:/pom.xml"));
//        System.out.println(new String(bytes,"utf-8"));

        //nio read file
//        FileInputStream fileInputStream = new FileInputStream(new File("d:/pom.xml"));
//        FileChannel channel = fileInputStream.getChannel();
//
//        ByteBuffer buffer = ByteBuffer.allocate(1024);
//
//        int length=-1;
//        while((length=channel.read(buffer))!=-1){//从channel里读取  到buffer
//            buffer.clear();//clear 将位置置为0  limit=capacity 用于下次从头开始读取  但是不会真正清除buffer的内容
//            byte[] bytes = buffer.array();//从buffer里取出内容
//            System.out.println(new String(bytes));
//        }

        //nio write file
        FileOutputStream fos=new FileOutputStream(new File("d:/niodemo.txt"));
        FileChannel channel = fos.getChannel();

        //使用buffer包裹 内容
        ByteBuffer buffer = Charset.forName("utf-8").encode("hello world! 123");

        int length=0;
        while((length=channel.write(buffer))!=0){

        }
    }
}
