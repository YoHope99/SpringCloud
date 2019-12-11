package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.tit.myrule.MyselfRule;

@SpringBootApplication
@EnableEurekaClient  // 开启客户端注册进入到erureka服务中
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
