package com.tips_new_meta.bigdata;

/**
 * Created by yuan on 2018/3/22.
 */
public class SimpleHashDemo {

    private static final int cap=2<<4;

    public static int addHash(String src){
        int hash=0;
        for(int i=0;i<src.length();i++){
            hash=hash+src.charAt(i);
        }
        return hash&(cap-1);
    }

    //seed 一般为质数
    //可以灵活生成多个独立的hashfun
    public static int addHash2(String src,int seed){
        int hash=0;
        for(int i=0;i<src.length();i++){
            hash=hash*seed+src.charAt(i);
        }
        return hash&(cap-1);
    }

    public static int java(String str) {
        int h = 0;
        int off = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            h = 31 * h + str.charAt(off++);
        }
        return h;
    }

    public static void main(String[] args) {
//        System.out.println(addHash("aa"));
//        System.out.println(addHash("bb"));

        System.out.println(addHash2("aa",11));
        System.out.println(addHash2("aa",13));
    }
}
