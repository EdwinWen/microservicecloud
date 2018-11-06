package com.edwin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wenpuzhao on 2018/10/11.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {
    public static void main (String[] args){
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
