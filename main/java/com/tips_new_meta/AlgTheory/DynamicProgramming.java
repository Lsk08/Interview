package com.tips_new_meta.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/2/27.
 */

/**
 * 动态编程
 *  特征 最优子结构 + 子问题重叠
 *   = 一个问题的解【包含】子问题的最优解 + 子问题有重叠 【反复求解相同的子问题】【备注】 子问题之间必须独立
 *   通常 自底向顶
 */
public class DynamicProgramming {

    public static int maxPrice(int[] p,int n){

        int[] r=new int[n+1];
        int q=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                q=Math.max(q,p[j]+r[i-j]);
            }
            r[i]=q;
        }

        System.out.println(Arrays.toString(r));
        return r[n];

    }

    public static void main(String[] args) {
        int[] price={0,1,5,8,9,10,17,17,20,24,30};

        System.out.println(maxPrice(price,4));


    }
}
