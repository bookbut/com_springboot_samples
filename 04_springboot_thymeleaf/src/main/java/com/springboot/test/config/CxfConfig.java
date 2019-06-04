package com.springboot.test.config;

import com.seatel.service.UserInfoService;
import com.seatel.service.UserInfoServiceImp;
import com.seatelgroup.fivepay.demo.service.UserInfoService;
import com.seatelgroup.fivepay.demo.service.UserInfoServiceImp;
import com.seatelgroup.fivepay.service.UserInfoService;
import com.seatelgroup.fivepay.service.UserInfoServiceImp;
import com.seatelgroup.mpay.demo.service.UserInfoService;
import com.seatelgroup.mpay.demo.service.UserInfoServiceImp;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    //同等 application.properties cxf.path=/webservice
//	@Bean
//	public ServletRegistrationBean servletRegistrationBean() {
//		ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet(), "/webservice/*");
//		bean.setLoadOnStartup(0);
//		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		return bean;
//	}
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public UserInfoService userInfoService() {
        return new UserInfoServiceImp();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userInfoService());
        endpoint.publish("/user");
        return endpoint;
    }
}