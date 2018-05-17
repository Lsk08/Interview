package com.ifsage.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/4/16.
 */
public class GenericPattern {

    class Child1 extends GenericPattern{

    }

    class Child2 extends GenericPattern{

    }

    void test(){
        List<? extends GenericPattern> list=new ArrayList<>();
//        list.add(new Child1());
//        list.add(null);
//        list.add(new Object());
//        list.add(new GenericPattern());

        GenericPattern genericPattern = list.get(0);
        Child1 child1 = (Child1) list.get(0);
    }

    public static void main(String[] args) {

    }
}
