package com.yp.AlgTheory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuan on 2018/3/2.
 */
public class GcdAlg {

    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,Math.floorMod(a,b));

    }

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put(null,"aa");





        System.out.println(map.get(null));

     //   System.out.println(gcd(30,21));
    }
}
