package com.wzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.wzw.myrule.MySelfRule;

//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如：
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}


}
