package com.seatelgroup.mpay.demo.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seatel.entity.UserEntity;
import com.seatel.mapper.UserMapper;

@RestController  //等价每个函数前面添加@ResponseBody
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

	/*
	* 结合httpClient
	* */

	@RequestMapping(value="request1",method = RequestMethod.POST)
//        @ModelAttribute 可有可无 好像
	String getPostData1(String username,String nickname){
		System.out.println("客户端请求的参数1" + username + " " + nickname );

		JSONObject result = new JSONObject();
		result.put("result",1);
		result.put("code","success");
		JSONObject data = new JSONObject("{\"uid\":\"10000\",\"title\":\"test request2\",\"content\":\"this is a request2\"}");
		result.put("data",data);
		System.out.println("getPostData1" + result.toString());
		return  result.toString();
	}

	@RequestMapping(value="request2",method = RequestMethod.POST)
	String getPostData2(@RequestBody String params){
		System.out.println("客户端请求的参数2" + params);

		JSONObject result = new JSONObject();
		result.put("result",1);
		result.put("code","success");
		JSONObject data = new JSONObject("{\"uid\":\"10000\",\"title\":\"test request1\",\"content\":\"this is a request1\"}");
		result.put("data",data);
		System.out.println("getPostData2" + result.toString());
		return  result.toString();
	}
}
