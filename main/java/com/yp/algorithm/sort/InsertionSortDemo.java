package com.yp.algorithm.sort;

/**
 * Created by yuan on 2017/12/19.
 */
public class InsertionSortDemo {

    public static void main(String[] args) {

        int[] ss={6,4,3,2,1};
        for(int i=1;i<ss.length;i++){
            int target=ss[i];
            int j=i;
            while(j>0&&target<ss[j-1]){
                ss[j]=ss[j-1];
                j--;
            }
            ss[j]=target;

        }

        for(int s:ss){
            System.out.println(s);
        }


    }
}
