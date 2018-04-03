package com.yp.threadLocal;

import java.util.Random;

/**
 * Created by yuan on 2018/3/8.
 */
public class ThreadLocalDemo2 {

    ThreadLocal<Person> local=new ThreadLocal<Person>(){
        @Override
        protected Person initialValue() {
            return new Person();
        }
    };

    public void f1(){
        Person p=local.get();
        p.setAge(new Random().nextInt());
        p.setName("aa");
        System.out.println(p.toString());
    }

    public void f2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(local.get());
            }
        }).start();
    }

    public static void main(String[] args) {
        ThreadLocalDemo2 t= new ThreadLocalDemo2();
        t.f1();
        t.f2();


    }

}
