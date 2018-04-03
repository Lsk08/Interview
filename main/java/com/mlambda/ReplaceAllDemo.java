package com.mlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuan on 2018/4/2.
 */
public class ReplaceAllDemo {

    //List 接口方法 replaceAll
    //UnaryOperator T apply(T t) 输入一个t 返回一个t
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("hello","world","list","removeif","demo"));
        list.replaceAll(s -> {
            if(s.length()>4){
                return s;
            }
            return s.toUpperCase();
        });

        System.out.println(list.toString());
    }
}
