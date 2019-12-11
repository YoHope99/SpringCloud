package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
* @ClassName:  DeptConsumer_DashBoard_App
* @author: yohope
* @Description: TODO(这里用一句话描述这个类的作用)
* @date: 2019年12月11日 上午9:52:50
*/
@SpringBootApplication
@EnableHystrixDashboard //开启HystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
