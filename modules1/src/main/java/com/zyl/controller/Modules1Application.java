package com.zyl.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"com.zyl"})
public class Modules1Application {
    public static void main(String[] args) {
        SpringApplication.run(Modules1Application.class,args);
    }
}
