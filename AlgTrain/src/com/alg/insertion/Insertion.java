package com.alg.insertion;

import java.util.Arrays;

/**
 * Created by yuan on 2018/6/22.
 */
public class Insertion {

    public static void main(String[] args) {


        int[] a={6,5,4,3,2,1};

        for(int i=1;i<a.length;i++){
            int cur=a[i];
            int j;
            for(j=i-1;j>=0 && a[j]>cur;j--){
                a[j+1]=a[j];
            }
            a[j+1]=cur;

        }

        System.out.println(Arrays.toString(a));

    }
}
