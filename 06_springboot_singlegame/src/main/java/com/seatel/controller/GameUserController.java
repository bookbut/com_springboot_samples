package com.seatel.controller;

import com.google.gson.JsonObject;
import com.seatel.data.Constants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//用户管理
@RestController  //等价每个函数前面添加@ResponseBody
@RequestMapping("/user")
public class GameUserController {
    @RequestMapping("/login")
    public String login(@RequestParam("userId") int userId,@RequestParam("userName") String userName){
        JsonObject result = new JsonObject();
        result.addProperty(Constants.STATUS,Constants.RESULT_SUCCESS_STATUS);
        result.addProperty(Constants.DESC,Constants.RESULT_SUCCESS_DESC);
        return "hello";
    }
}
