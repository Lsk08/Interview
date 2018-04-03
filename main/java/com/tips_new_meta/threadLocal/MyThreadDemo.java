package com.tips_new_meta.threadLocal;

import java.util.UUID;

/**
 * Created by yuan on 2018/3/8.
 */
public class MyThreadDemo {

    MyThreadLocal<String> local=new MyThreadLocal<String>(){
        @Override
        public String init() {
           return UUID.randomUUID().toString();
        }
    };

    public void f1(){
        System.out.println(local.get());
    }

    public void f2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                local.set("Thread2");
                System.out.println(local.get());
            }
        }).start();
    }


    public static void main(String[] args) {
        MyThreadDemo obj = new MyThreadDemo();
        obj.f1();
        obj.f2();

    }
}
