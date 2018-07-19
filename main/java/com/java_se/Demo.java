package com.java_se;

/**
 * 代码块执行顺序  static>main>non-static>construct
 * static只执行一次
 * Created by yuan on 2018/7/3.
 */
public class Demo {

    static {
        System.out.println("static");
    }

    {
        System.out.println("non-static");
    }

    public Demo(){
        System.out.println("construct");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Demo demo=new Demo();
        Demo demo1=new Demo();
    }
}
