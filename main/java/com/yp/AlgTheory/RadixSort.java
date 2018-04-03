package com.yp.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/24.
 */
//O(d(n+k)) = d【位数】*(n+k)【计数排序】
    //从低位开始
    //在 k 的范围比较小 使用计数排序比较好 O(n+k)
    //当 k 比较大 用基数排序  O(d(n+k)) 此时 k 是每一位的范围
public class RadixSort {

    // for 1 to d:
    //  countSort or 稳定排序
    public static void radixSort(int[] a,int d){

        for(int i=1;i<=d;i++){

            int[] aa=new int[a.length];
            for(int j=0;j<a.length;j++){
                aa[j]=getDigit(a[j],i);
            }
            //System.out.println(Arrays.toString(aa));

            int[] tmp=new int[10];
            for(int j=0;j<aa.length;j++){
                tmp[aa[j]]+=1;
            }

            for(int j=1;j<tmp.length;j++){
                tmp[j]+=tmp[j-1];
            }

            //count finish

            //define position
            int[] res=new int[a.length];
            for(int j=res.length-1;j>=0;j--){
                res[tmp[aa[j]]-1]=a[j];
                tmp[aa[j]]-=1;
            }

            a=res;
            System.out.println(Arrays.toString(a));
        }

    }

    public static int getDigit(int num,int d){
        return (num/(d==1?1:10*(d-1)))%10;
    }

    public static void main(String[] args) {
        radixSort(new int[]{12,5,3,0,2,3,0,3},2);
        //System.out.println(getDigit(5,1));
    }
}
