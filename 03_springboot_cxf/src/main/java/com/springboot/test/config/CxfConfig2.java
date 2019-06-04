package com.springboot.test.config;

import javax.xml.ws.Endpoint;

import com.seatel.service.CommonService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig2 {
//    @Autowired
//    private Bus bus;

//        @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus() {
//        return new SpringBus();
//    }
//
//    @Autowired
//    CommonService commonService;
//
//    /** JAX-WS **/
//    @Bean
//    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(springBus(), commonService);
//        endpoint.publish("/CommonService");
//        return endpoint;
//    }
}