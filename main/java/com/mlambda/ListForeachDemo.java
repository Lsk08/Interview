package com.mlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuan on 2018/4/2.
 */
public class ListForeachDemo {

    //Collection.foreach(consumer)
    //Collection = list + set +queue
    //Consumer 的方法签名 = void accept(T t) 也就是接受一个参数  返回void
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("hello","world"));
        list.forEach(item->{
            System.out.println(item);
        });
    }
}
