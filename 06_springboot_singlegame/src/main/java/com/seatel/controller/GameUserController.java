package com.seatel.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.seatel.data.Constants;
import com.seatel.entity.GameUser;
import com.seatel.service.GameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//用户管理
@RestController  //等价每个函数前面添加@ResponseBody
@RequestMapping("/user")
public class GameUserController {
    @Autowired
    GameUserService gameUserService;

    @RequestMapping("/login")
    public String login(@RequestParam("userId") long  userId,@RequestParam("userName") String userName){
        JsonObject result = new JsonObject();
        result.addProperty(Constants.STATUS,Constants.RESULT_SUCCESS_STATUS);
        result.addProperty(Constants.DESC,Constants.RESULT_SUCCESS_DESC);

        Gson gson = new Gson();
        GameUser gameUser = gameUserService.getGameUser(userId,userName);
        result.add(Constants.DATA, gson.toJsonTree(gameUser));
        return gson.toJson(result);
    }
}
