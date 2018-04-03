package com.tips_new_meta.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/23.
 */
public class InsertionSort {

    public static void insertionSort(int[] a){
        if (a==null||a.length==1) return;

        //假定左边的元素已经排好，只用处理右边的元素
        for(int j=1;j<a.length;j++){
            int k=a[j];
            int i=j-1;
            //对于左边的元素，找到比key大的，向右移动
            while(i>=0&&k<a[i]){
                a[i+1]=a[i];
                i--;
            }
            //把右边第一个插入对应位置
            a[i+1]=k;
        }
    }

    public static void main(String[] args) {
        int[] a={6,4,3,11,2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
