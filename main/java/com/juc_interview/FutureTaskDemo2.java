package com.juc_interview;

import java.util.concurrent.*;

/**
 * Created by yuan on 2018/4/3.
 */
public class FutureTaskDemo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        Future<Integer> future=cachedThreadPool.submit(()->{
            System.out.println("running");
            return 1;
        });

        while(true){
            if(future.isDone()){
                System.out.println(future.get());
                break;
            }

        }

        cachedThreadPool.shutdown();
    }
}
