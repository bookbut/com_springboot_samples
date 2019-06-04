package com.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 测试velocity;
 * @author Angel --守护天使
 * @version v.0.1
 * @date 2016年10月4日
 */
@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name", "[Angel -- 守护天使]");
        return "hello";
    }

    @RequestMapping("/test")
    public String test(Map<String,Object> map){
        map.put("name", "测试");
        return "test";
    }


//    @RequestMapping("/hello")
//    public String hello(Map<String,Object> map){
//        map.put("name", "[Angel -- 守护天使]");
//        map.put("gender",1);//gender:性别，1：男；0：女；
//
//        List<Map<String,Object>> friends =new ArrayList<Map<String,Object>>();
//        Map<String,Object> friend = new HashMap<String,Object>();
//        friend.put("name", "张三");
//        friend.put("age", 20);
//        friends.add(friend);
//        friend = new HashMap<String,Object>();
//        friend.put("name", "李四");
//        friend.put("age", 22);
//        friends.add(friend);
//        map.put("friends", friends);
//        return "hello";
//    }

}