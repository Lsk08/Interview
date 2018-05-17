package com.js;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/4/20.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
