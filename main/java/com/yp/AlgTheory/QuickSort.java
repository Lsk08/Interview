package com.yp.AlgTheory;

/**
 * Created by yuan on 2018/2/23.
 */
//应用最广泛
//好处 1-性能期望号 c*nlogn 并且c较小 2-原址排序  也就是最多额外消耗常数空间
// 平均期望是 nlogn的只有 快排 归并 堆排  n 的是 桶排序、基数排序、计数排序  n^2 是插入、选择、冒泡
public class QuickSort {

    //partion -> 得到 low
    //sort
    public static void quickSort(int[] a,int l,int r){
        if(l>=r) return;

        int low=l;
        int high=r;
        int key=a[l];

        while(low<high){
            while(low<high&&a[high]>key){
                high--;
            }


            while(low<high && a[low]<key){
                low++;
            }

            if(low < high){
                int tmp=a[high];
                a[high]=a[low];
                a[low]=tmp;
            }

        }

       // a[low]=key;
        quickSort(a,l,low-1);
        quickSort(a,low+1,r);


    }

    public static void main(String[] args) {
        int[] ss={7,6,4,3,2,1,11,22,33,23};
        quickSort(ss,0,ss.length-1);
        for(int s:ss){
            System.out.println(s);
        }
    }
}
