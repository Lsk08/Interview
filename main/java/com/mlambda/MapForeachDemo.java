package com.mlambda;

import java.util.HashMap;

/**
 * Created by yuan on 2018/4/2.
 */
public class MapForeachDemo {

    //BiComsumer  void accept(T t, U u)  T = ? super K  U = ? super U
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.forEach((key,value)->{
            System.out.println(key+" = "+ value);
        });
    }
}
