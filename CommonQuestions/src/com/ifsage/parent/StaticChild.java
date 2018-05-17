package com.ifsage.parent;

/**
 * Created by yuan on 2018/4/16.
 */
public class StaticChild extends StaticExtemds{

    static void f1(){
        System.out.println("bb");
    }

    public static void main(String[] args) {
        f1();
    }
}
