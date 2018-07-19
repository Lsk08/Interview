package com.juc_interview;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuan on 2018/5/24.
 */
public class BlockingQueueDemo {

    private List<String> list=new LinkedList<>();

    private int maxSize=3;

    private Object lock=new Object();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void put(String s) throws InterruptedException {
        synchronized (lock){
            if(list.size()>=maxSize){
                System.out.println("waiting ...");
                lock.wait();
                System.out.println("retart ....");
            }

            list.add(s);
            lock.notify();
        }
    }

    public void poll() throws InterruptedException {
        synchronized (lock){
            if(list.size()==0){
                lock.wait();
            }

            list.remove(list.size()-1);
            lock.notify();
        }
    }

}
