package com.tips_new_meta.AlgTheory;

import java.util.Arrays;

/**
 * Created by yuan on 2018/3/1.
 */
public class KMPPrefix {

    public static void KMP(String[] t,String[] p){
        int n=t.length;
        int m=p.length;
        int q=0;
        int prefix[]=prefixFunction(p);

        System.out.println(Arrays.toString(prefix));

        for(int i=0;i<t.length;i++){

            while(q>0&&!t[i].equals(p[q])){
                q=prefix[q];
            }

            if(t[i].equals(p[q])){
                q++;
            }
            if(q==m) System.out.println("matches at"+(i-m+1));
            //prefix[q]=q;
        }
    }

    public static int[] prefixFunction(String[] p){
        int[] ans=new int[p.length];
        Arrays.fill(ans,0);
        int k=0;
        for(int i=1;i<p.length;i++){
            while(k>0&&!p[i].equals(p[k])){
                k=ans[k];
            }
            if(p[i].equals(p[k])){
                k++;
            }
            ans[i]=k;
        }
        return ans;
    }

    public static void main(String[] args) {
       // prefixFunction(new String[]{"a","b","a","b","a","c","a"});

        KMP(new String[]{"a","a","a","b","c"},new String[]{"b","c"});
    }
}
