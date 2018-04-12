package com.juc_interview;

/**
 * Created by yuan on 2018/4/3.
 */

public class WakeThreadDemo {

    private static Object lock=new Object();

    //sleep可以被interrupt唤醒
    public static void f1(){
        Thread t=new Thread(()->{
            System.out.println("running");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("waking...");
//                e.printStackTrace();
            }finally {
                System.out.println("existing...");
            }
        });
        t.start();
        t.interrupt();
    }

    //wait 也可以被interrupt唤醒
    public static void f2(){
        synchronized (lock){
            Thread t=new Thread(()->{
                System.out.println("running");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("waking...");
//                e.printStackTrace();
                }finally {
                    System.out.println("existing...");
                }
            });
            t.start();
            t.interrupt();
        }
    }

    public static void main(String[] args) {
        f2();

    }
}
