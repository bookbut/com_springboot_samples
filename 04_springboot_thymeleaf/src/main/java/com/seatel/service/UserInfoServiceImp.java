package com.seatel.service;

import com.seatel.entity.UserInfo;

import javax.jws.WebService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService(targetNamespace = "http://service.demo.paybay.cn/", endpointInterface = "com.seatel.service.UserInfoService")
public class UserInfoServiceImp implements UserInfoService {

    private Map<Long, UserInfo> userMap = new HashMap<Long, UserInfo>();

    public UserInfoServiceImp() {
        System.out.println("向实体类插入数据");
        UserInfo user = new UserInfo();
        user.setUserId(411001);
        user.setUsername("zhansan");
        user.setAge(20);
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new UserInfo();
        user.setUserId(411002);
        user.setUsername("lisi");
        user.setAge(30);
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new UserInfo();
        user.setUserId(411003);
        user.setUsername("wangwu");
        user.setAge(40);
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);
    }

    @Override
    public String getName(long userId) {
        return "liyd-" + userId;
    }

    @Override
    public UserInfo getUser(long userId) {
        System.out.println("userMap是:" + userMap);
        return userMap.get(userId);
    }
}