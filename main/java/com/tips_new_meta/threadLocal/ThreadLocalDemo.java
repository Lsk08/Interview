package com.tips_new_meta.threadLocal;

/**
 * Created by yuan on 2018/3/8.
 */
public class ThreadLocalDemo {
    ThreadLocal<String> local=new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "aa";
        }
    };

    public void f1(){
        local.set("bb");

        System.out.println(local.get());
    }

    public static void main(String[] args) {
        new ThreadLocalDemo().f1();
    }
}
