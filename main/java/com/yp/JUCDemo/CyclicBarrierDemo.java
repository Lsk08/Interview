package com.yp.JUCDemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by yuan on 2018/4/2.
 */

//new CyclicBarrier(int n) n=任务数量
    // barrier.await();  等待其他任务完成  然后继续执行
    //让一系列任务在同一个点等待对方
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2);

        new Thread(()->{
            System.out.println("task 1 running ...");
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("task 1 finish");

            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println("task 1 real-finish");

        }).start();

        new Thread(()->{
            System.out.println("task 2 running ...");
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("task 2 finish");

            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("task 2 real-finish");

        }).start();

    }


}
