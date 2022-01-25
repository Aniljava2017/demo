package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/msg")
    public void msg(){
        System.out.println("hello");
    }
    @RequestMapping("/name")
    public String name(){
        return "This is Print my name";
    }
}
