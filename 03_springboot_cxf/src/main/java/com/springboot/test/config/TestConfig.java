package com.springboot.test.config;

import com.seatel.service.UserService;
import com.seatel.service.impl.UserServiceImpl;
import com.seatelgroup.fivepay.demo.service.UserService;
import com.seatelgroup.fivepay.demo.service.impl.UserServiceImpl;
import com.seatelgroup.fivepay.service.UserService;
import com.seatelgroup.fivepay.service.impl.UserServiceImpl;
import com.seatelgroup.mpay.demo.service.UserService;
import com.seatelgroup.mpay.demo.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import javax.xml.ws.Endpoint;

@Configuration
public class TestConfig {
    //二选一同等 application.properties cxf.path=/test
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
//        return new ServletRegistrationBean(new CXFServlet(), "/test/*");
        ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet(), "/test/*");
		bean.setLoadOnStartup(0);
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return  bean;
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        endpoint.publish("/user");
        return endpoint;
    }
}