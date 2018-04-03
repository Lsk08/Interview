package com.yp.httputil;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by yuan on 2017/12/19.
 */
public class HttpGetDemo {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient closeableHttpClient= HttpClients.createDefault();

        String uriGet="http://blog.csdn.net/xiaoxian8023/article/details/49863967";
        HttpGet httpGet=new HttpGet(uriGet);

        CloseableHttpResponse response=closeableHttpClient.execute(httpGet);

        HttpEntity entity=response.getEntity();

        String str=EntityUtils.toString(entity);
        System.out.println(str);

        response.close();
        closeableHttpClient.close();
    }
}
