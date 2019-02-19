package com.dongdong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Application_hystixdashboard {
    public static void main(String[] args){
        SpringApplication.run(Application_hystixdashboard.class,args);
    }
}
