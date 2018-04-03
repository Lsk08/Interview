package com.yp.SetDemo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by yuan on 2018/3/8.
 */
public class SetDemo {
//    private static Set<Integer> bossJudge=new HashSet<Integer>();
//
//    {
//        bossJudge.add(24);
//        bossJudge.add(72);
//        bossJudge.add(132);
//        bossJudge.add(170);
//        bossJudge.add(220);
//    }

    private static Set<Integer> bossJudge=new HashSet<Integer>(){{
        add(24);
        add(72);
        add(132);
        add(170);

    }};

    private static List<String> list=new LinkedList<String>(){{
        add("a");
        add("b");
    }};
    public static void main(String[] args) {
//        System.out.println(list.toString());

        System.out.println(new BigDecimal("292355").divide(new BigDecimal("100")));
    }
}
