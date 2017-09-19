package com.seatel.entity;

import com.seatel.enums.UserSex;

public class User {
	private int id;
	private String userName;
	private String passWord;
	private String nickName;
	private UserSex userSex;
	
	public User() {
		super();
	}

	public User(int id, String userName, String passWord, String nickName, UserSex userSex) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.nickName = nickName;
		this.userSex = userSex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserSex getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSex userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "User:id=" + this.id + "&userName=" + this.userName + "&passWord=" + this.passWord + "&address="
				+ this.nickName + "&userSex=" + this.userSex;
	}
}
