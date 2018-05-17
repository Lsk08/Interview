package com.ifsage;

/**
 * Created by yuan on 2018/4/16.
 */
public class IntegerAndInt {

    public static void main(String[] args) {
        //Integer 和 int 主要是 一个是 类  一个是基本类型 在运算的时候会进行 自动装箱
        //其次  Integer 在 -128 到 127 之间会被常量池缓存 面对 == 的时候 会有所不同

        //对于Integer 和 int 一定是true 由于自动装箱
        //new 出来的Integer 对于 == 肯定是false
        //直接引用的 Integer 对于 == 需要看它 是否在常量池 也就是 -128 - 127 之间
//        Integer i=100;
        int i=100;
//        Integer j=128;
        Integer j=new Integer(100);
        System.out.println(i==j);



    }
}
