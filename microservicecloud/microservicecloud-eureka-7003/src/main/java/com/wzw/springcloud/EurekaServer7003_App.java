package com.wzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer		//EurekaServer服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
public class EurekaServer7003_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServer7003_App.class, args);
	}


}
