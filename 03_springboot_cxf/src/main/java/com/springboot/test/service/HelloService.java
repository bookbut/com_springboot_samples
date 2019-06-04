package com.springboot.test.service;

import javax.jws.WebService;

@WebService(portName="helloService", serviceName="helloService", targetNamespace="http://service.seatel.com/")
public interface HelloService {

    String sayHello(String name);

}