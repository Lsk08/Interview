package com.tips_new_meta.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by yuan on 2017/12/25.
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5).stream().filter(a->a>3).map(a->a+1).collect(Collectors.toList());
        System.out.println(list);

        Map<String,List<String>> list2=Arrays.asList("a","b","aa","bb","aaa","bbb").stream().collect(Collectors.groupingBy(s->s.charAt(0)+""));
        System.out.println(list2);
    }
}
