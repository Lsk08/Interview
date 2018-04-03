package com.tips_new_meta.JUCDemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yuan on 2018/4/2.
 */

//关键方法  new CountDownLatch(int n)  计数器个数
    //  countDown()  计数器 -1
// await() 当前线程等待 直到计数器 == 0 开始执行
    //让 另一个任务 等待子任务到达特定的点
public class CountDownDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(2);

        new Thread(()->{
            System.out.println("task1 running");
            countDownLatch.countDown();
            System.out.println("task1 finish");
        }).start();

        new Thread(()->{
            System.out.println("task2 running");
            countDownLatch.countDown();
            System.out.println("task2 finish");
        }).start();

        System.out.println("waiting tasks finish....");
        countDownLatch.await();
        System.out.println("main task finish");

    }
}
