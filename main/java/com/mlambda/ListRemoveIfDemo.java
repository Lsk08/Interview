package com.mlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuan on 2018/4/2.
 */
public class ListRemoveIfDemo {

    //Collection.removeIf
    //实现一个predict 接口签名 boolean test(T t) 传入一个t 返回一个boolean
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("hello","world","list","removeif","demo"));
        list.removeIf(item->{
            return item.length()<=4;
        });

        System.out.println(list.toString());
    }
}
