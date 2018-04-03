package com.tips_new_meta.algorithm.sort;

/**
 * Created by yuan on 2017/12/19.
 */
public class QuickSortDemo {

    public static int getMiddle(int[] ss,int low,int high){
        int key=ss[low];

        while(low<high){

            while(low<high&&ss[high]>=key){
                high--;
            }
            ss[low]=ss[high];

            while(low<high&&ss[low]<=key){
                low++;
            }
            ss[high]=ss[low];

        }

        ss[high]=key;
        return high;

    }

    public static void quickSort(int[] ss,int low,int high){
        if(low>=high) return;
        int mid=getMiddle(ss,low,high);
        quickSort(ss,low,mid-1);
        quickSort(ss,mid+1,high);
    }

    public static void quicksort2(int[] ss,int l,int r){
        if(l>=r) return;

            int i=l;
            int j=r;
            int x=ss[i];

        while(i<j){
            while(i<j&&ss[j]>x){
                j--;
            }
            if(i<j){
                ss[i++]=ss[j];
            }

            while(i<j&&ss[i]<x){
                i++;
            }
            if(i<j){
                ss[j--]=ss[i];
            }
        }

        ss[i]=x;
        quicksort2(ss,l,i-1);
        quicksort2(ss,i+1,r);

    }

    public static void main(String[] args) {
        int[] ss={7,6,4,3,2,1};
        quicksort2(ss,0,ss.length-1);
        for(int s:ss){
            System.out.println(s);
        }
    }
}
