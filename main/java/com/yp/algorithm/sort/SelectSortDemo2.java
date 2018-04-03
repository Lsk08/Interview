package com.yp.algorithm.sort;

import java.util.*;
import java.util.Arrays;

/**
 * Created by yuan on 2018/1/11.
 */
public class SelectSortDemo2 {

    //选择排序 = 选择 + 排序 = 固定一个i，遍历数组 选出最小的下标 + 交换
    public static void selectSort(int[] nums){
        if(nums==null||nums.length==0) return;

        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }

            int tmp=nums[i];
            nums[i]=nums[min];
            nums[min]=tmp;

        }
    }

    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
