package com.juc_interview;

/**
 * Created by yuan on 2018/5/28.
 */
public class SingletonFactory {
    public static class InnerClass{
        public static SingletonFactory singleton=new SingletonFactory();

    }

    public static SingletonFactory getInstance(){
        return InnerClass.singleton;
    }
}
