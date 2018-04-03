package com.yp.httputil;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2017/12/19.
 */
public class HttpPostDemo {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient client= HttpClients.createDefault();

        HttpPost post=new HttpPost("https://aa");

        List<NameValuePair> list=new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("a","v"));

        post.setEntity(new UrlEncodedFormEntity(list,"utf-8"));

        CloseableHttpResponse response = client.execute(post);
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity, "utf-8");
        EntityUtils.consume(entity);

        client.close();
    }
}
