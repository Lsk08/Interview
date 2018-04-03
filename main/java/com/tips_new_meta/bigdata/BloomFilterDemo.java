package com.tips_new_meta.bigdata;

/**
 * Created by yuan on 2018/3/22.
 */
public class BloomFilterDemo {

    int[] seeds={11,13,17,31,43,61};

    int cap=2<<6;

    boolean[] filter=new boolean[cap];

    String[] target={"111@qq.com","222@qq.com","333@qq.com","444@qq.com"};

    {
        int seedIndex=0;
        for(String s:target){
            for(int i=0;i<seeds.length;i++){
                filter[SimpleHashDemo.addHash2(s,seeds[i])]=true;
            }

        }
    }

    public boolean exist(String target){
        for(int i=0;i<seeds.length;i++){
            if(filter[SimpleHashDemo.addHash2(target,seeds[i])]==false) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new BloomFilterDemo().exist("2222@qq.com"));
    }
}
