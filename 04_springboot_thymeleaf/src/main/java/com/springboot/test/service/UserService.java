package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatel.entity.User;
import com.seatel.enums.UserSex;
import com.seatel.mapper.UserDao;
import com.seatel.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<User> queryUserList() {
		return userDao.queryUserList();
	}

	@Autowired
	private UserMapper userMapper;

	public User getUserById(int id) {
		// return new User(100, "aliang", "pad:11", "nickname:ss", UserSex.MAN);
		System.out.println("id:" + id);
		return userMapper.getUserById(id);
	}

	public List<User> getUsers() {
		return userMapper.getUsers();
	}

	public void insert(String userName, String passWord, String nickName, UserSex userSex) {
		System.out.println(userName + passWord + nickName+ userSex);
		userMapper.insert(userName, passWord, nickName, userSex);
	}
}
