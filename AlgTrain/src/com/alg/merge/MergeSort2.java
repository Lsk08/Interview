package com.alg.merge;

import java.util.Arrays;

/**
 * mergesort分为 sort + merge
 * sort 表示对 target的left 和 right 做排序
 * merge表示 把 排好的left和right merge到一起
 * Created by yuan on 2018/7/3.
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] list={4,3,2,6,5,65,43,32,11};

        sort(list,0,list.length-1);

        System.out.println(Arrays.toString(list));

    }

    public static void sort(int[] list,int left,int right){
        if(left>=right) return;

        int mid=(left+right)/2;
        sort(list,left,mid);
        sort(list,mid+1,right);

        merge(list,left,mid,right);

    }

    public static void merge(int[] list,int left,int mid,int right){
        int cur0=left;
        int cur1=left;
        int cur2=mid+1;

        int cur3=left;

        int[] tmp=new int[list.length];

        while(cur1<=mid && cur2<=right){
            tmp[cur0++]=list[cur1]<list[cur2]?list[cur1++]:list[cur2++];
        }

        while(cur1<=mid){
            tmp[cur0++]=list[cur1++];
        }

        while(cur2<=right){
            tmp[cur0++]=list[cur2++];
        }

        while(cur3<=right){
            list[cur3]=tmp[cur3++];
        }

    }


}
