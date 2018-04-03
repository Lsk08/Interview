package com.yp.algorithm.sort;

import java.util.Arrays;

/**
 * Created by yuan on 2018/1/11.
 */
public class MergeSortDemo {

    public static void sort(int[] data,int left,int right){
        int center=(left+right)/2;

        if(left<right){
            sort(data,left,center);
            sort(data,center+1,right);

             merge(data,left,center,right);
        }

    }

    public static void merge(int[] data,int left,int mid,int right){
        if(data==null||data.length==0) return ;
        int[] newData=new int[data.length];

        int p1=left;
        int p2=mid+1;
        int newIndex=left;
        while(p1<=mid && p2<=right){

            if(data[p1]<data[p2]){
                newData[newIndex++]=data[p1++];
            }else{
                newData[newIndex++]=data[p2++];
            }
        }

        while(p1<=mid){
            newData[newIndex++]=data[p1++];
        }

        while(p2<=right){
            newData[newIndex++]=data[p2++];
        }

//        System.out.println(Arrays.toString(newData));

        while(left<=right){
            data[left]=newData[left++];
        }

    }

    public static void main(String[] args) {
        int[] data={33,43,66,8,6,5,4,3,2,1};
        sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
