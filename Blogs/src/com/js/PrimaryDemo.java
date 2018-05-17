package com.js;

/**
 * Created by yuan on 2018/4/20.
 */
public class PrimaryDemo {

    public static void main(String[] args) {
        int a=5;
        int b=a;
        a=1;
        System.out.println(a+"         "+b);

        Person p=new Person();
        Person p2=p;
        p.name="aa";
        System.out.println(p2.name);

    }

    static class Person{
        public String name;
    }
}
