package com.alg.bubble;

import java.util.Arrays;

/**
 * Created by yuan on 2018/6/22.
 */
public class Bubble {

    public static void main(String[] args) {
        int[] a={6,5,4,3,2,1};

        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
