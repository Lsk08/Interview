package com.juc_interview;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by yuan on 2018/4/3.
 */
//
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //FutureTask 实现了RunnableFuture =
        // 实现了一个 callable 表示它可以被执行 并且返回一个结果
        //同时又实现了 Future 表示可以  判断任务是否完成isDone 取消任务cancel 异步获取任务结果get
        FutureTask<Integer> futureTask=new FutureTask<Integer>(()->{
            System.out.println("task is running");
            Thread.sleep(3000);
            return 1;
        });

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.submit(futureTask);

        Integer result=futureTask.get();
        System.out.println(result);

        //不关闭就会一直running
        cachedThreadPool.shutdown();
    }
}
