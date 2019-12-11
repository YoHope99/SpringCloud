package com.tit.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyselfRule {
    
	@Bean
	public IRule myRule() {
//		return new RandomRule();  //默认轮询，自定义随机
//      return new RoundRobinRule()；
		return new RandomRule_ZY();
	}
}
