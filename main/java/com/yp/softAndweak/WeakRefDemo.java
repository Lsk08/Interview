package com.yp.softAndweak;

import java.lang.ref.WeakReference;

/**
 * Created by yuan on 2018/3/9.
 */
public class WeakRefDemo {

    //joc的解释  如果一个对象没有强引用 = 就会在某个时间 清除指向这个对象的所有weakreference
    public static void main(String[] args) {
        String s=new String("s");
        WeakReference<String> str=new WeakReference<String>(s);
        System.out.println(str.get());

        s=null;

        System.gc();

        System.out.println(str.get());
    }
}
