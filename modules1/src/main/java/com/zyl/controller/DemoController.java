package com.zyl.controller;

import com.zyl.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/hello1")
    public String hello1(){
        return demoService.hello1();
    }

}
