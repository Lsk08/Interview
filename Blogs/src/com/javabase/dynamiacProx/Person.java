package com.javabase.dynamiacProx;

/**
 * Created by yuan on 2018/4/20.
 */
//代理要求代理 和 真实对象 具有相同的功能  所以反应到代码就是一个interface约定
    //而且既然是代理类 就需要一个真实对象
    //和一个代理对象  代理对象的作用 = 1 拦截client对于真实对象的访问  2 做出和真实对象一致的动作
public interface Person {

     String sing();

    String dance();
}
