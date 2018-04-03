package com.tips_new_meta.algorithm.sort;

import java.util.Arrays;

/**
 * Created by yuan on 2017/12/20.
 */
//选择排序
//1 选择最小的  交互到第一位
// 2 选择次小的  交互到第二位

//改进  每次选择最大 和 最小
public class SelectSortDemo {

    public static int[] selectSort(int[] nums){
        for (int i=0;i<nums.length;i++){
            int min=i;
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int tmp=nums[i];
            nums[i]=nums[min];
            nums[min]=tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        Arrays.toString(selectSort(nums));
    }

}
