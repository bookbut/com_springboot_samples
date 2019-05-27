package com.seatelgroup.fivepay.service;

import javax.jws.WebService;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@WebService(portName="helloService", serviceName="helloService", targetNamespace="http://service.seatel.com/")
public class HelloServiceImpl implements HelloService {

    private Random random = new Random();

    @Override
    public String sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(2);//随机睡眠5-25秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name;
    }

}