package com.tips_new_meta.softAndweak;

import java.lang.ref.SoftReference;

/**
 * Created by yuan on 2018/3/9.
 */
public class SoftRefDemo {

    public static void main(String[] args) {
        SoftReference<String> str=new SoftReference<String>("aa");
        System.out.println(str.get());
    }
}
