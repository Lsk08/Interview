package com.java_se;

/**
 * Created by yuan on 2018/7/3.
 */
public class SystemDemo {

    public static void main(String[] args) {
        //System.out.println(System.getenv());
        new Thread(new Runnable(){ //匿名

            public void run(){

                System.out.println("runnable run");

            }

        }){

            public void run(){

                System.out.println("subthread run");

            }

        }.start();
    }
}
