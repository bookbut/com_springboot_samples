import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@Slf4j
@SpringBootApplication(scanBasePackages = {"com.seatel"})

//@MapperScan("com.seatel.mapper")
@EnableSwagger2
public class Application {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("文档标题")
                .description("文档描述")
                .contact(new Contact("aliang", "http://www.baidu.com", "932888148@qq.com"))
                .license("内部使用")
                .licenseUrl("http://localhost")
                .version("1.0")
                .build();
//        return new ApiInfo("文档标题","文档描述","1.0","http://localhost/","aliangt","使用权限","http://www.baidu.com");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        try {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("action", "test"));
            HttpEntity entity = new UrlEncodedFormEntity(params, "utf-8");

            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(3000)
                    .setConnectionRequestTimeout(1000)
                    .setSocketTimeout(3000).build();

            HttpPost httpPost = new HttpPost("http://localhost:8080/test");
            httpPost.setEntity(entity);
            httpPost.setConfig(requestConfig);

            CloseableHttpClient httpclient = HttpClients.createDefault();
            CloseableHttpResponse response = httpclient.execute(httpPost);

            String result = EntityUtils.toString(response.getEntity());
            System.out.println("test============>" + result);
        } catch (IOException e) {
            System.out.println("exception============>" + e.toString());
        }
    }
}
