package com.edwin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wenpuzhao on 2018/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.edwin.springcloud"})
@ComponentScan("com.edwin.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
