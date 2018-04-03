package com.mlambda;

import java.util.HashMap;

/**
 * Created by yuan on 2018/4/2.
 */
public class MapReplaceAllDemo {

    //BiComsumer     R apply(T t, U u);  返回值赋值给 value
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.replaceAll((k,v)->{
            return k+v.toUpperCase();
        });

        map.forEach((key,value)->{
            System.out.println(key+" = "+ value);
        });
    }
}
