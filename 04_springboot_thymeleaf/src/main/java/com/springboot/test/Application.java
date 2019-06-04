package com.springboot.test;

import com.seatel.test.HttpClientTest;
import com.seatelgroup.fivepay.demo.test.HttpClientTest;
import com.seatelgroup.fivepay.test.HttpClientTest;
import com.seatelgroup.mpay.demo.test.HttpClientTest;
import com.springboot.test.test.HttpClientTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seatel.mapper")
public class Application{
//	public class Application extends SpringBootServletInitializer{
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		
		System.out.println("调用本地post 接口");

		new HttpClientTest().request1();
		new HttpClientTest().request2();
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		UserService userService = context.getBean(UserService.class);
//		List<User> users = userService.queryUserList();
//		for(User user:users) {
//			System.out.println(user.toString());
//		}
//		context.destroy();

	}


//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		// TODO Auto-generated method stub
//		return builder.sources(Application.class);
//	}
}
