package com.ifsage;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 * Created by yuan on 2018/3/21.
 */
public class SubscribeDemo {

    public static void main(String[] args) {
        Jedis client=new Jedis("192.168.11.173",6379);

        System.out.println("connection");

        client.set("news","hello");

//        client.subscribe(new JedisPubSub() {
//            @Override
//            public void onMessage(String channel, String message) {
//                System.out.println(message);
//                super.onMessage(channel, message);
//            }
//        },"news");
    }
}
