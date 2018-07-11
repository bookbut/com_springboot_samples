package com.seatelgroup.mpay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.seatel"})
//@EnableConfigurationProperties({PropertiesConfig.class})
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
