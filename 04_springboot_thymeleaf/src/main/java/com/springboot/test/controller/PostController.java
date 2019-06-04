package com.springboot.test.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

//        请求方式： post
//        需要传递参数： c= {"uid":"10000","title":"test a title","content":"this is a test"}
//        参数内容为json格式
//        输出：{result:0,code:"success"}
//        格式为json格式：result：1 .成功，0. 失败
//        code: 为提示信息
@RestController
public class PostController {
        @RequestMapping(value="request1",method = RequestMethod.POST)
//        @ModelAttribute 可有可无 好像
        String getPostData1(String username,String nickname){
                System.out.println("客户端请求的参数1" + username + " " + nickname );

                JSONObject result = new JSONObject();
                result.put("result",1);
                result.put("code","success");
                JSONObject data = new JSONObject("{\"uid\":\"10000\",\"title\":\"test request2\",\"content\":\"this is a request2\"}");
                result.put("data",data);
                System.out.println("getPostData1" + result.toString());
                return  result.toString();
        }

        @RequestMapping(value="request2",method = RequestMethod.POST)
        String getPostData2(@RequestBody String params){
                System.out.println("客户端请求的参数2" + params);

                JSONObject result = new JSONObject();
                result.put("result",1);
                result.put("code","success");
                JSONObject data = new JSONObject("{\"uid\":\"10000\",\"title\":\"test request1\",\"content\":\"this is a request1\"}");
                result.put("data",data);
                System.out.println("getPostData2" + result.toString());
                return  result.toString();
        }

//        @PostMapping("/submit")
//        public String greetingSubmit(@ModelAttribute Greeting greeting) {
//                return "result";
//        }
}
