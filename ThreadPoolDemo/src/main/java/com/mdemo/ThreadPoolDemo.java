package com.mdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yuan on 2017/12/13.
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //而 Executor 仅仅只有一个 submit方法 相当于一个执行者
        //ExecutorService 继承Executor 提供了线程池的主要方法 包括 submit、shutdown、terminate 等等
        //Executors相当于一个工厂 生产ExecutorService的子类 也就是ThreadPoolExecutor【也就是ThreadPoolExecutor是ExecutorService的默认实现】
        // 对应的不同实现，
        // 例如 newSingleThreadExecutor()、newFixedThreadExecutor()、newCachedThreadPool()
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            System.out.println("aa");
        });
        executorService.shutdown();
    }
}
