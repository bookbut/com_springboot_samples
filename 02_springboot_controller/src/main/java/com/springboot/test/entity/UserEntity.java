package com.springboot.test.entity;

import java.io.Serializable;

import com.seatel.enums.UserSexEnum;
import com.seatelgroup.mpay.demo.enums.UserSexEnum;

public class UserEntity implements Serializable{

	/**
	 * Serializable变量
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String nickName;
	private String passWord;
	private UserSexEnum userSex;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(String userName,String passWord, UserSexEnum userSex) {
		this.userName = userName;
		this.passWord = passWord;
		this.userSex = userSex;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public UserSexEnum getUserSex() {
		return userSex;
	}
	public void setUserSex(UserSexEnum userSex) {
		this.userSex = userSex;
	}

	
}
