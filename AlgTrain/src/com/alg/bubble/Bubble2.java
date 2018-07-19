package com.alg.bubble;

import java.util.Arrays;

/**
 * 两两比较  把最大的交换到最后 O(N^2)
 *2层循环 i:1->list.length 表示每次排好的个数
 * j: 0->list.leng-i 表示最后i个会被排好
 * 最后一个 swap j,j+1
 * Created by yuan on 2018/7/2.
 */
public class Bubble2 {

    public static void main(String[] args) {

        int[] list={4,5,76,3,1,33,66};

        for(int i=1;i<list.length;i++){
            for(int j=0;j<list.length-i;j++){
                if(list[j]>list[j+1]){
                    int tmp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=tmp;
                }
            }
        }

        System.out.println(Arrays.toString(list));


    }
}
