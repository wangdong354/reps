package com.dongdong.consumer.controller;

import com.dongdong.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    public static  final  String REST_URL_PREFIX="http://localhost:8081";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumes/dept/add")
    public  boolean add(Dept dept){
        return  restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consumes/dept/get/{id}")
    public  Dept get(@PathVariable("id")Long id){
        return  restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumes/dept/list")
    public List<Dept> list(){
        return  restTemplate.getForObject(REST_URL_PREFIX + "/dept/list/",List.class);
    }
}
