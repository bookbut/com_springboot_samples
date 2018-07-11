package com.seatelgroup.mpay.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Controller {
//    @Autowired
//    Config config;

//    @RequestMapping("test")
//    public Map<String, Object> configurationProperties() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("zh", config.success_en);
//        map.put("en", config.success_km);
//        map.put("km", config.success_zh);
//        return map;
//    }

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/hello")
    public String hello() {
        String msg1 = messageSource.getMessage("welcome", null, new Locale("en"));
        String msg2 = messageSource.getMessage("welcome", null, new Locale("zh"));
        String msg3 = messageSource.getMessage("welcome", null, new Locale("km"));
        String msg4 = messageSource.getMessage("welcome", null, null);
        return msg1 + msg2 + msg3 + msg4;
    }
}
