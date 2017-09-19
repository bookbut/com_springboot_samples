package com.seatel.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable{
    private long userId;
    private String username;
    private int age;
    private Date updateTime;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getUserId() {

        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
