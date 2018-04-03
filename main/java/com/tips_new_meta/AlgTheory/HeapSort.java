package com.tips_new_meta.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/23.
 */
public class HeapSort {
    //问题  下标索引必须从1开始  有【删除】的操作

    public static void heapify(int[] a,int i){
        if(i>a.length) return;

        int left=i<<1;
        int right=(i<<1)+1;
        int maxIndex=1;

        if(left<=a.length&&a[left-1]>a[i-1]){
            maxIndex=left;
        }else{
            maxIndex=i;
        }

        if(right<=a.length&&a[right-1]>a[i-1]){
            maxIndex=right;
        }

        //swap
        if(maxIndex!=i){
            int tmp=a[maxIndex-1];
            a[maxIndex-1]=a[i-1];
            a[i-1]=tmp;

            heapify(a,maxIndex);
        }


    }

    public static void buildMaxHeap(int[] a){
        for(int i=a.length/2;i>=1;i--){
            heapify(a,i);
        }
    }

    public static int[] heapSort(int[] a){
        buildMaxHeap(a);

        //System.out.println(Arrays.toString(a));

        int[] res=new int[a.length];

        int size=a.length;
        int i=0;
        while(size>0){
            res[i]=a[0];
            i++;

            a[0]=a[size-1];
            a=Arrays.copyOf(a,a.length-1);
            heapify(a,1);
            size--;

        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={5,4,3,22,33};
        int[] res=heapSort(a);
        System.out.println(Arrays.toString(res));
    }

}
