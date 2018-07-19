package com.java_se;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/7/3.
 * 抽象类可以有构造器 因为子类可以调用
 * 但是无法直接调用抽象类的构造器
 *
 * 抽象类的目的就是不让该类创建对象而让子实现类正常使用
 */
public abstract class Abs {

    public Abs(){

    }

    public static void main(String[] args) {
//        new Abs();
//        Object obj=new Object();
//        List list=new ArrayList<>();
//        System.out.println(list.getClass());
        new Throwable();
    }
}
