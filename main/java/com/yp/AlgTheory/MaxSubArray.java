package com.yp.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/23.
 */
public class MaxSubArray {

    public static int[] maxSubArray(int[] a,int low,int high){
        if(low==high){
            int[] re={low,high,a[low]};
            return re;
        }

        int mid=(low+high)/2;
        int[] left=maxSubArray(a,low,mid);
        int[] right=maxSubArray(a,mid+1,high);
        int[] cross=crossSubArray(a,low,high);

        if(left[2]<right[2]){
            if(right[2]<cross[2]){
                return cross;
            }else{
                return right;
            }
        }else{
            if(left[2]<cross[2]){
                return cross;
            }else{
                return left;
            }
        }
    }

    public static int[] crossSubArray(int[] a,int low,int high){
        int mid=(low+high)/2;

        //left max sum
        int leftsum=0;
        int leftmax=0;
        int leftIndex=0;
        for(int i=mid;i>=0;i--){
            leftsum+=a[i];
            if(leftsum>leftmax){
                leftmax=leftsum;
                leftIndex=i;
            }
        }

        int rightsum=0;
        int rightmax=0;
        int rightIndex=mid;
        for(int i=mid+1;i<high;i++){
            rightsum+=a[i];
            if(rightsum>rightmax){
                rightmax=rightsum;
                rightIndex=i;
            }
        }

        int[] re={leftIndex,rightIndex,leftmax+rightmax};
        return re;
    }

    public static void main(String[] args) {
        int[] a={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(Arrays.toString(maxSubArray(a,0,a.length-1)));
    }
}
