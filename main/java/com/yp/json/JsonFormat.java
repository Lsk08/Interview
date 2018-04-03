package com.yp.json;

/**
 * Created by yuan on 2017/12/27.
 */
public class JsonFormat {

    public static void main(String[] args) {
//        String json=String.format("{\"id\":%d,\"name\":\"%s\",\"result\":%s,\"success\":%b}", 1,"xiaoming","{\"json\":1}",true);
//        System.out.println(json);

        System.out.println(String.format("{\"success\":%b,\"message\":\"%s\",\"code\":%d}", true,"数据开始收集",0));
    }
}
