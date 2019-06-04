package com.springboot.test.controller;

import java.util.List;

import com.seatel.entity.Loin;
import com.seatelgroup.mpay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seatel.entity.Greeting;
import com.seatel.entity.User;
import com.seatel.enums.UserSex;
import com.seatel.service.UserService;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
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

	@RequestMapping("/insert")
	@ResponseBody
	public void insertUser(@RequestParam("userName") String userName, @RequestParam("nickName") String nickName,
			@RequestParam("passWord") String passWord, @RequestParam("userSex") String sexName) {
		// {"id":1001,"userName":"aliang","passWord":"10086","nickName":"linyongliang","userSex":"MAN"}
		// System.out.println(userStr);
		// JSONObject ujObj = new JSONObject(userStr);
		// int id = ujObj.getInt("id");
		// String userName = ujObj.getString("userName");
		// String passWord = ujObj.getString("passWord");
		// String nickName = ujObj.getString("nickName");
		// UserSex userSex = ujObj.getString("userSex") == "WOMAN" ? UserSex.WOMAN :
		// UserSex.MAN;
		UserSex userSex = sexName.equals("MAN") ? UserSex.MAN : UserSex.WOMAN;
		System.out.println("userName=" + userName+ "&passWord=" + passWord + "&nickName=" + nickName + "&userSex=" + userSex);
		userService.insert(userName, passWord, nickName, userSex);
	}
	
//　　　　$.ajax({
//　　　　url:"/login",
//　　　　type:"POST",
//　　　　data:'{"userName":"admin","pwd","admin123"}',
//　　　　content-type:"application/json charset=utf-8",
//　　　　success:function(data){
//　　　　　　alert("request success ! ");
//　　　　}
//});

//@requestMapping("/login")
//public void login(@requestBody String userName,@requestBody String pwd){
//　　System.out.println(userName+" ："+pwd);
//}
//这种情况是将JSON字符串中的两个变量的值分别赋予了两个字符串，但是呢假如我有一个User类，拥有如下字段：
//　　String userName;
//　　String pwd;
//那么上述参数可以改为以下形式：@requestBody User user 这种形式会将JSON字符串中的值赋予user中对应的属性上
//需要注意的是，JSON字符串中的key必须对应user中的属性名，否则是请求不过去的。
	
//    @GetMapping("/greeting")
    @RequestMapping(value="greeting",method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/submit")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

	@RequestMapping(value="model")
	public String modelTest(Model model) {
		model.addAttribute("login", new Loin(1001,"mode name","dfdfdfdf"));
		return "model";
	}

	@RequestMapping(value="modelview")
	public ModelAndView modelViewTest() {
		ModelAndView mav = new ModelAndView("model");
		mav.addObject("id","1005");
		mav.addObject("username","aliang");
		return mav;
	}
}
