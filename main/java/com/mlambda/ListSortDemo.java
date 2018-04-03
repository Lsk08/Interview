package com.mlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuan on 2018/4/2.
 */
public class ListSortDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("hello","world","list","removeif","demo"));
        list.sort((s1,s2)->s1.length()-s2.length());

        System.out.println(list.toString());
    }
}
