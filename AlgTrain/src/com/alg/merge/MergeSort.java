package com.alg.merge;

import java.util.Arrays;

/**
 * 分而治之的思想
 * 首先把 数组分为 左右两部分  mid=(left+right)/2
 * 分别排序  在merge
 *  merge = 创建一个临时数组   把左右数组的结果按照index插入  最后回写
 *  NlogN
 * Created by yuan on 2018/7/2.
 */
public class MergeSort {



    public static void main(String[] args) {

        int[] list={4,3,5,6,76,65,54,43};

        int left=0;
        int right=list.length-1;
        sort(list,left,right);

        System.out.println(Arrays.toString(list));

    }

    private static void sort(int[] list,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        sort(list,left,mid);
        sort(list,mid+1,right);

        merge(list,left,mid,right);
    }

    private static void merge(int[] list,int left,int mid,int right){
        int[] tmp=new int[list.length];

        int cur1=left;
        int cur0=left;
        int cur2=mid+1;
        int cur3=left;


        while(cur1<=mid && cur2<=right){
            tmp[cur3++]=list[cur1]>list[cur2]?list[cur2++]:list[cur1++];
        }


        while(cur1<=mid){
            tmp[cur3++]=list[cur1++];
        }

        while(cur2<=right){
            tmp[cur3++]=list[cur2++];
        }

        while(cur0<=right){
            list[cur0]=tmp[cur0++];
        }
    }
}
