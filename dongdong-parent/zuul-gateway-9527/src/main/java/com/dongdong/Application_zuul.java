package com.dongdong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Application_zuul {
    public static void main(String[] args){
        SpringApplication.run(Application_zuul.class,args);
    }
}
