package com.yp.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/24.
 */
public class CountSort {

    public static int[] countSort(int[] a,int k){
        int[] tmp=new int[k+1];
        for(int i=0;i<a.length;i++){
            tmp[a[i]]+=1;
        }

        for(int i=1;i<tmp.length;i++){
            tmp[i]=tmp[i-1]+tmp[i];
        }
    //此时tmp中每个元素也就是当前小于改元素的元素个数、也就是
        int[] res=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            res[tmp[a[i]]-1]=a[i];
            tmp[a[i]]-=1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countSort(new int[]{2,5,3,0,2,3,0,3},5)));
    }
}
