package com.tit.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName:  ConfigClientRest
* @author: yohope
* @Description: TODO(这里用一句话描述这个类的作用)
* @date: 2019年12月11日 下午2:26:34
*/
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;
    
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/config")
    public String getConfig(){
        String str = "application: " + applicationName + "\t eurekaServers:" + eurekaServer + " \t serverPort" + serverPort;
        System.out.println(str);
        return str;
    }
}
