package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
* @ClassName:  Zuul_9527_StartSpringCloud_App
* @author: yohope
* @Description: TODO(这里用一句话描述这个类的作用)
* @date: 2019年12月11日 上午10:41:40
*/
@SpringBootApplication
@EnableZuulProxy     //开启Zuul路由网关
public class Zuul_9527_StartSpringCloud_App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloud_App.class,args);
    }

}

