package com.springboot.test;

import com.seatelgroup.fivepay.demo.service.CommonService;
import com.seatelgroup.fivepay.demo.service.HelloServiceImpl;
import com.seatelgroup.fivepay.demo.service.wsimport.HelloService;
import com.seatelgroup.fivepay.service.CommonService;
import com.seatelgroup.fivepay.service.HelloServiceImpl;
import com.seatelgroup.fivepay.service.wsimport.HelloService;
import com.seatelgroup.mpay.demo.service.CommonService;
import com.seatelgroup.mpay.demo.service.HelloServiceImpl;
import com.seatelgroup.mpay.demo.service.wsimport.HelloService;
import com.springboot.test.service.CommonService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Map;

@SpringBootApplication
public class Application{
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);

		c0();
//		cl1();
	}

	public static  void c0()throws Exception{
		//发布
		Endpoint.publish("http://localhost:8081/hello", new HelloServiceImpl());

		//调用
		try {
			String targetNamespace = "http://service.seatel.com/";
			QName serviceName = new QName(targetNamespace, "helloService");
			QName portName = new QName(targetNamespace, "helloService");
			URL wsdl = new URL("http://localhost:8081/hello");
			//内部会创建一个ServiceDelegate类型的对象赋给属性delegate
			Service service = Service.create(wsdl, serviceName);
			//会利用delegate创建一个服务接口的代理对象，同时还会代理BindingProvider和Closeable接口。
			HelloService helloService = service.getPort(portName, HelloService.class);


			BindingProvider bindingProvider = (BindingProvider) helloService;
			Map<String, Object> requestContext = bindingProvider.getRequestContext();
			requestContext.put("com.sun.xml.internal.ws.connection.timeout", 3 * 1000);//建立连接的超时时间为10秒
			requestContext.put("com.sun.xml.internal.ws.request.timeout", 3 * 1000);//指定请求的响应超时时间为15秒

			//在调用接口方法时，内部会发起一个HTTP请求，发起HTTP请求时会从BindingProvider的getRequestContext()返回结果中获取超时参数，
			//分别对应com.sun.xml.internal.ws.connection.timeout和com.sun.xml.internal.ws.request.timeout参数，
			//前者是建立连接的超时时间，后者是获取请求响应的超时时间，单位是毫秒。如果没有指定对应的超时时间或者指定的超时时间为0都表示永不超时。

			System.out.println(helloService.sayHello("Elim"));

		} catch (Exception e) {
			System.out.println("io exception=================================>" + e.toString());
		}
	}
	public static  void cl0()throws Exception{
		JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
		org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8080/test/user?wsdl");
		//getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
		Object[] objects=client.invoke("getUser","411001");
		//输出调用结果
		System.out.println("*****"+objects[0].toString());
	}
	/**
	 * 方式1.代理类工厂的方式,需要拿到对方的接口
	 */
	public static void cl1() {
		try {
			// 接口地址
			String address = "http://localhost:8080/services/CommonService?wsdl";
			// 代理工厂
			JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
			// 设置代理地址
			jaxWsProxyFactoryBean.setAddress(address);
			// 设置接口类型
			jaxWsProxyFactoryBean.setServiceClass(CommonService.class);
			// 创建一个代理接口实现
			CommonService cs = (CommonService) jaxWsProxyFactoryBean.create();
			// 数据准备
			String userName = "Leftso";
			// 调用代理接口的方法调用并返回结果
			String result = cs.sayHello(userName);
			System.out.println("返回结果:" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 动态调用方式
	 */
	public static void cl2() {
		// 创建动态客户端
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://localhost:8080/services/CommonService?wsdl");
		// 需要密码的情况需要加上用户名和密码
		// client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,
		// PASS_WORD));
		Object[] objects = new Object[0];
		try {
			// invoke("方法名",参数1,参数2,参数3....);
			objects = client.invoke("sayHello", "Leftso");
			System.out.println("返回数据:" + objects[0]);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}
}
