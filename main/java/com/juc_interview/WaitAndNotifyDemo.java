package com.juc_interview;

/**
 * Created by yuan on 2018/5/24.
 */
public class WaitAndNotifyDemo {



    public static void main(String[] args) throws InterruptedException {
        BlockingQueueDemo queue=new BlockingQueueDemo();

        queue.put("a");
        queue.put("b");
        queue.put("c");

        Thread t1=new Thread(()->{
            try {
                queue.put("d");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();


        Thread.sleep(2000);

        new Thread(()->{
            try {
                queue.poll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        t1.join();
        System.out.println(queue.getList().toString());
    }
}
