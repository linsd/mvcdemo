package com.lsd.mvc.demo1.controller;

import com.lsd.mvc.demo1.model.People;
import com.lsd.mvc.demo1.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lsd on 2016/10/29.
 */
@Controller
@RequestMapping("/my")
public class MyController {

    @Autowired
    ConfigService configService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("hostName:" + configService.getHostName());
        System.out.println("hostPort:" + configService.getHostPort());
        System.out.println("hostPort2:" + configService.getHostPort2());
        System.out.println("name:" + name);
        return "Hello " + name;
    }

    @RequestMapping("/people")
    @ResponseBody
    public People people(@RequestParam(value = "name", defaultValue = "World") String name,
                       @RequestParam(value = "age", defaultValue = "18") int age) {
        return new People(name, age);
    }

    @RequestMapping("/people2")
    @ResponseBody
    public People people2(@RequestBody People people) {
        System.out.println("name:" + people.getName());
        System.out.println("age:" + people.getAge());
        return people;
    }

    @RequestMapping("/hl")
    public String hl() {
        return "hello2";
    }
}
