package com.tit.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced // Spring cloud Ribbon 是基于 Netflix Ribbon 实现的一套客户端， 负载均衡的工具
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule() {
//		return new RandomRule(); //用随机算法代替默认的轮询算法
		return new RetryRule();
	}

}
