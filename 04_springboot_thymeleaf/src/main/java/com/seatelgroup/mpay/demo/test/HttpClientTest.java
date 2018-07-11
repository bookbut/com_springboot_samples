package com.seatelgroup.mpay.demo.test;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class HttpClientTest {

    public void request1() {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String url = "http://localhost:8080/request1";

        HttpPost method = new HttpPost(url);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("nickname", "nick jhon"));
        params.add(new BasicNameValuePair("username", "Jhon"));
        params.add(new BasicNameValuePair("password", "125858e"));

        String resData;
        try {
            method.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse result = httpclient.execute(method);
            resData = EntityUtils.toString(result.getEntity());
            System.out.println("result1:" + resData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void request2() {
        //方法一调用
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String url = "http://localhost:8080/request2";

        HttpPost method = new HttpPost(url);

        StringEntity entity;
        String resData = "";
        try {
            entity = new StringEntity("{\"username\":\"server\",\"password\":\"nihao\"}", "utf-8");
//			entity.setContentEncoding("UFT-8");
            entity.setContentType("application/json");
            method.setEntity(entity);
            HttpResponse result = httpclient.execute(method);
            resData = EntityUtils.toString(result.getEntity());
            System.out.println("result2:" + resData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
