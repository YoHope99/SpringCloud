package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
* @ClassName:  Config_3344_StartSpringCloudApp
* @author: yohope
* @Description: TODO(这里用一句话描述这个类的作用)
* @date: 2019年12月11日 下午1:12:42
*/
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
	}

}
