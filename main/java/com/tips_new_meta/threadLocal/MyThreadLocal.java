package com.tips_new_meta.threadLocal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuan on 2018/3/8.
 */
public class MyThreadLocal<T> {

    private Map<Thread,T> map=new HashMap<>();

    public T init(){
        return null;
    }

    public T get(){
        if(!map.containsKey(Thread.currentThread())){
            map.put(Thread.currentThread(),init());
        }
        return (T)map.get(Thread.currentThread());
    }

    public void set(T t){
        map.put(Thread.currentThread(),t);
    }
}
