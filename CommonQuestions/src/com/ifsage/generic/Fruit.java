package com.ifsage.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/4/16.
 */
public class Fruit extends Food{


    void f1(){
        List<Fruit> list=new ArrayList<>();
        list.add(new Apple());
    }

    public static void main(String[] args) {

    }
}
