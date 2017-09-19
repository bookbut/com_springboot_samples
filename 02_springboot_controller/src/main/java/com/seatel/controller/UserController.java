package com.seatel.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seatel.entity.UserEntity;
import com.seatel.mapper.UserMapper;

@RestController
public class UserController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("hello")
	public String getHello() {
		return "MyHello";
	}

	@RequestMapping("/users")
	public List<UserEntity> getUsers() {
		List<UserEntity> users = userMapper.getAll();
		return users;
	}

	@RequestMapping("/add")
	public void save(UserEntity user) {
		userMapper.insert(user);
	}

	@RequestMapping(value = "update")
	public void update(UserEntity user) {
		userMapper.update(user);
	}

	// path?id=xx
	@RequestMapping(value = "/path")
	public String getPathById1(@RequestParam("id") int id) {
		System.out.println("path param: " + id);
		return "path?id=" + id;
	}

	// path?id=xx
	@RequestMapping(value = "/path/{id}")
	public String getPathById2(@PathVariable("id") int id) {
		System.out.println("path variable: " + id);
		return "path/" + id;
	}

	// path3/some.123
	@RequestMapping(value = "/path3/{name:[a-z]+}.{id:[\\d]+}")
	public String getPathByReg(@PathVariable("name") String name, @PathVariable("id") int id) {
		System.out.println("path/" + " name" + name + " id: " + id);
		return "path3/" + " name:" + name + " id: " + id;
	}
	
	// path4?name=some&id=123
	@RequestMapping(value = "/path4")
	public String getPathByParams(@RequestParam("name") String name, @RequestParam("id") int id) {
		System.out.println("path4?" + " name=" + name + "&id=" + id);
		return "path4?" + " name=" + name + "&id=" + id;
	}
	
	// path5?json={name:"aliang",id:"1001"}
	@RequestMapping(value = "/path5")
	public String getPathByJson(@RequestParam("json") String json) {
		System.out.println("path5?json=" + json);
				
		JSONObject jsonObj = new JSONObject(json);
		System.out.println("name:" + jsonObj.getString("name") + "&id:" + jsonObj.getInt("id"));
		return "path5?json=" + json;
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		System.out.println("delete user id: " + id);
		// userMapper.delete(id);
	}

}
