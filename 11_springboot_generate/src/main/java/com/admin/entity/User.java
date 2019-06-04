package com.admin.entity;

public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userName;

    /**
     * 昵称
     */
    private String userNicename;

    /**
     * 
     */
    private String userPhone;

    /**
     * 
     */
    private Integer userLevel;

    /**
     * 
     */
    private String userUrl;

    /**
     * 
     */
    private String userEmail;

    /**
     * 
     */
    private Integer userStatus;

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return user_password 
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 
     * @param userPassword 
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 昵称
     * @return user_nicename 昵称
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     * 昵称
     * @param userNicename 昵称
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename == null ? null : userNicename.trim();
    }

    /**
     * 
     * @return user_phone 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     * @param userPhone 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 
     * @return user_level 
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 
     * @param userLevel 
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 
     * @return user_url 
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * 
     * @param userUrl 
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * 
     * @return user_email 
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 
     * @param userEmail 
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 
     * @return user_status 
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 
     * @param userStatus 
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}