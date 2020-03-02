package com.wzw.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	  @Bean
	  public IRule myRule()
	  {
	   //return new RandomRule();//Ribbon默认是轮询，我自定义为随机
		  //return new RoundRobinRule();	//轮询
		  return new RandomRule_ZY();
	  }

}
