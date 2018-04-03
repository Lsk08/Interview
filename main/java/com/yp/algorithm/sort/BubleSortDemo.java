package com.yp.algorithm.sort;

/**
 * Created by yuan on 2017/12/19.
 */
public class BubleSortDemo {

    public static void main(String[] args) {
        int[] ss={3,2,4,5,1};
        for(int i=0;i<ss.length-1;i++){
            for(int j=0;j<ss.length-1-i;j++){
                if(ss[j]>ss[j+1]){
                    int tmp=ss[j];
                    ss[j]=ss[j+1];
                    ss[j+1]=tmp;
                }
            }
        }
        for (int s:ss){
            System.out.println(s);
        }
    }
}
