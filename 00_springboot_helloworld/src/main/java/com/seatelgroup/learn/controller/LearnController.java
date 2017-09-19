package com.seatelgroup.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatelgroup.learn.pojo.Learn;
import com.seatelgroup.learn.service.LearnService;

@RestController
//@RequestMapping("/learn")
public class LearnController {

	@Autowired
	private LearnService service;
	
	
	@RequestMapping("/")
	public String root(){
//		this.service.insert(learnName);
		return "hello";
	}
	
	@RequestMapping("/insert")
	public String insert(String learnName){
		this.service.insert(learnName);
		return "succ";
	}

	@RequestMapping("/select")
	public String select(String learnName){
		Learn learn = this.service.select(learnName);
		System.out.println(learn);
		return "succ";
	}
	
	@RequestMapping("/update")
	public String update(int learnId, int learnName){
		this.update(learnId, learnName);
		return "succ";
	}

	@RequestMapping("/delete")
	public String delete(int learnId){
		this.delete(learnId);
		return "succ";
	}
	
}
