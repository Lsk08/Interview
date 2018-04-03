package com.tips_new_meta.JUCDemo;

/**
 * Created by yuan on 2018/4/2.
 */
//wait notify  必须持有对象锁
    //wait 立即释放对象锁
    //notify 会继续执行后续代码
public class WaitAndNotify {

    static Object lock = new Object();

    public static void f1(){

        synchronized (lock){
            System.out.println("task 1 running");

            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("task 1 finish");
        }



    }

    public static synchronized void f2() {

        synchronized (lock){
            System.out.println("task 2 running");

            lock.notify();

            System.out.println("task 2 finish");
        }

    }
    public static void main(String[] args) {
        new Thread(()->{
            f1();
        }).start();

        new Thread(()->{
            f2();
        }).start();

    }
}
