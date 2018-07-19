package com.alg.quicksort;

import java.util.Arrays;

/**
 * 选择一个元素作为pivot 让左边的都<pivot 右边的都>pivot 然后递归
 * logn(N)
 * pivot的选择影响性能
 * Created by yuan on 2018/7/3.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] list={4,3,5,6,76,65,54,43};

        quickSort(list,0,list.length-1);

        System.out.println(Arrays.toString(list));
    }

    public static void quickSort(int[] list,int left,int right){
        if(left<right){
            int mid=getMid(list,left,right);
            quickSort(list,left,mid-1);
            quickSort(list,mid+1,right);
        }
    }

    public static int getMid(int[] list,int left,int right){

        int key=list[left];

        while(left<right){
            while(left<right && list[right]>key){
                right--;
            }
            list[left]=list[right];

            while(left<right && list[left]<key){
                left++;
            }
            list[right]=list[left];

        }
        list[left]=key;
        return left;
    }
}
