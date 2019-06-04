package com.springboot.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//和每个@mapper效果一样
@MapperScan("com.seatel.mapper")
public class Application{
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
