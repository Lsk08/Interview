package com.tips_new_meta.bigdata;

import java.util.Arrays;

/**
 * Created by yuan on 2018/3/22.
 */
public class HeapSort4Topk {

    public static int[] topk(int[] nums,int n){
        int[] res=new int[n];

        for(int i=0;i<nums.length;i++){

            if(nums[i]>res[0]){
                res[0]=nums[i];
                //把最小的上浮
                heapfy(res,0);
            }

        }
        return res;
    }

    public static void heapfy(int[] res,int index){
        int n=res.length;
        int left=index*2+1;
        left=left<n?left:-1;
        int leftVal=left==-1?Integer.MAX_VALUE:res[left];

        int right=index*2+2;
        right=right<n?right:-1;
        int rightVal=right==-1?Integer.MAX_VALUE:res[right];

        if(left==-1&&right==-1) return;

        if(leftVal<rightVal){
            if(res[index]>leftVal){
                int tmp=res[left];
                res[left]=res[index];
                res[index]=tmp;
                heapfy(res,left);
            }

        }else{
            if(res[index]>rightVal){
                int tmp=res[right];
                res[right]=res[index];
                res[index]=tmp;
                heapfy(res,right);
            }

        }



    }

    public static void main(String[] args) {

        int[] nums={5,8,7,6,11};
        int[] res=topk(nums,3);
        System.out.println(Arrays.toString(res));
    }
}
