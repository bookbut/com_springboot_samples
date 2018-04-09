package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class GoogleApi {


    public static void main(String[] args) {
        SpringApplication.run(GoogleApi.class, args);

        try {
            System.out.println(TranslateUtil.translate("你好", TranslateUtil.CHINA, TranslateUtil.ENGLISH));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
//        GoogleApi googleApi = new GoogleApi("122.224.227.202", 3128);
//        String result = googleApi.translate("Many applications within the enterprise domain ", "", "zh");
//        System.out.println(result);
    }


}