package com.wzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient	//服务发现
@EnableEurekaClient		//开启自动注解，会自动注册到eureka服务中
@SpringBootApplication	
@EnableCircuitBreaker	//对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}


}
