package com.seatelgroup.fivepay.entity;

import java.io.Serializable;

public class GameUser implements Serializable{
    private long userId;
    private String userName;
    private String userPhoto;

    private int bingoStrength;
    private int bingoHighSource;
    private int bingoCurrentDate;
    private int bingoHighPass;

    public GameUser() {
        super();
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getBingoStrength() {
        return bingoStrength;
    }

    public void setBingoStrength(int bingoStrength) {
        this.bingoStrength = bingoStrength;
    }

    public int getBingoHighSource() {
        return bingoHighSource;
    }

    public void setBingoHighSource(int bingoHighSource) {
        this.bingoHighSource = bingoHighSource;
    }

    public int getBingoCurrentDate() {
        return bingoCurrentDate;
    }

    public void setBingoCurrentDate(int bingoCurrentDate) {
        this.bingoCurrentDate = bingoCurrentDate;
    }

    public int getBingoHighPass() {
        return bingoHighPass;
    }

    public void setBingoHighPass(int bingoHighPass) {
        this.bingoHighPass = bingoHighPass;
    }
}
