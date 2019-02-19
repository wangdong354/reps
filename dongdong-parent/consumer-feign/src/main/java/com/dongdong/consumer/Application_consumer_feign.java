package com.dongdong.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.dongdong"})
@ComponentScan("com.dongdong")
public class Application_consumer_feign {
    public static void main(String[] args){
        SpringApplication.run(Application_consumer_feign.class,args);
    }
}
