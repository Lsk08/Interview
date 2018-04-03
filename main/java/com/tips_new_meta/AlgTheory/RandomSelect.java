package com.tips_new_meta.AlgTheory;

/**
 * Created by yuan on 2018/2/24.
 */
//选择第i个
public class RandomSelect {

    public static int ithSelect(int[] a,int l,int r,int t){
        if(l==r) return a[l];

        int q=partion(a, l, r);
        //System.out.println(q);
        int k=q-l+1;
        if(k==t) return a[k-1];

        if(k>t){
            return ithSelect(a,l,q-1,t);
        }else{
            return ithSelect(a,q+1,r,t-k);
        }
    }

    private static int partion(int[] a, int l, int r) {
        int left=l;
        int right=r;
        int key=a[l];
        while(left<right){
            while(left<right && a[left]<key){
                left++;
            }

            while(left<right && a[right]>key){
                right--;
            }

            if(left<right){
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
            }

        }

        return left;
    }

    public static void main(String[] args) {
        int res=ithSelect(new int[]{3,2,1,4},0,3,2);
        System.out.println(res);
    }
}
