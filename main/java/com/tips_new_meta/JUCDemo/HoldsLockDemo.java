package com.tips_new_meta.JUCDemo;

/**
 * Created by yuan on 2018/4/2.
 */
//Thread.holdsLock 当前线程是否持有某个对象锁
public class HoldsLockDemo {

    static Object lock=new Object();

    public static void f1(){
        synchronized (lock){
            System.out.println(Thread.holdsLock(lock));

        }
    }

    public static void f2(){

            System.out.println(Thread.holdsLock(lock));

    }

    public static void main(String[] args) {
f1();
f2();
    }
}
