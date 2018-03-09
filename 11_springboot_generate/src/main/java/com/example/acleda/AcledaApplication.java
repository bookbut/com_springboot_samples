package com.example.acleda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableSwagger2

public class AcledaApplication {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("支付文档")
                .description("文档描述")
                .contact(new Contact("seatel", "http://www.seatelgroup.com", "seatelgroup.com"))
                .license("内部使用")
                .licenseUrl("http://localhost")
                .version("1.0")
                .build();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AcledaApplication.class, args);
    }
}
