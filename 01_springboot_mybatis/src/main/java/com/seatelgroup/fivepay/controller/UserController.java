package com.seatelgroup.fivepay.controller;

import java.util.List;

import com.seatelgroup.mpay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.seatel.entity.User;
import com.seatel.enums.UserSex;
import com.seatel.service.UserService;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String getRoot() {
		return "hello";
	}

	@RequestMapping("/user")
	@ResponseBody
	public User getUserById(@RequestParam("id") int id) {
		return userService.getUserById(id);
	}

	@RequestMapping("/users")
	@ResponseBody
	public List<User> getUsers() {
		return userService.getUsers();
	}

//	@RequestMapping("/insert")
//	@ResponseBody
//	public void insertUser(@RequestParam("userName") String userName, @RequestParam("nickName") String nickName,
//			@RequestParam("passWord") String passWord, @RequestParam("userSex") String sexName) {
//		// {"id":1001,"userName":"aliang","passWord":"10086","nickName":"linyongliang","userSex":"MAN"}
//		// System.out.println(userStr);
//		// JSONObject ujObj = new JSONObject(userStr);
//		// int id = ujObj.getInt("id");
//		// String userName = ujObj.getString("userName");
//		// String passWord = ujObj.getString("passWord");
//		// String nickName = ujObj.getString("nickName");
//		// UserSex userSex = ujObj.getString("userSex") == "WOMAN" ? UserSex.WOMAN :
//		// UserSex.MAN;
//		UserSex userSex = sexName.equals("MAN") ? UserSex.MAN : UserSex.WOMAN;
//		System.out.println("userName=" + userName+ "&passWord=" + passWord + "&nickName=" + nickName + "&userSex=" + userSex);
//		userService.insert(userName, passWord, nickName, userSex);
//	}
}
