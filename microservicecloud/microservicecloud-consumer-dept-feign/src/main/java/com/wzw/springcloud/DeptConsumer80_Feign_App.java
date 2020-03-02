package com.wzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages= {"com.wzw.springcloud"})
@ComponentScan("com.wzw.springcloud")
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_Feign_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}


}
