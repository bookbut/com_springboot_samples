package com.seatelgroup.mpay.demo.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "ComService", // 与接口中指定的name一致
        targetNamespace = "http://service.seatel.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.seatel.service.CommonService"// 接口地址
)
@Component
public class CommonServiceImpl implements CommonService {

    @Override
    public String sayHello(String name) {

        return "Hello ," + name;
    }

}