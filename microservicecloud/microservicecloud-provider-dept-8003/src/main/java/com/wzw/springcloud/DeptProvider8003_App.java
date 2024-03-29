package com.wzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@EnableEurekaClient		//开启自动注解，会自动注册到eureka服务中
@SpringBootApplication	//服务发现
public class DeptProvider8003_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}


}
