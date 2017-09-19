package com.seatelgroup.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seatelgroup.learn.pojo.Learn;
import com.seatelgroup.learn.sql.LearnMapper;

@Component
public class LearnService {
	
	@Autowired
	private LearnMapper mapper;
	
	public void insert(String learnName){
		this.mapper.insert(learnName);
	}

	public Learn select(String learnName){
		return this.mapper.select(learnName);
	}
	
	public void update(int learnId, int learnName){
		this.mapper.update(learnId, learnName);
	}

	public void delete(int learnId){
		this.mapper.delete(learnId);
	}
}
