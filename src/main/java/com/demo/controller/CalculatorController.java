package com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("/add")
    public String addition(@RequestParam int a, @RequestParam int b){

        int sum=a+b;
        return "Add The Value:- "+a+ " + " +b+ " = " +sum;
    }
    @RequestMapping("/sub/{a}/{b}")
    public String subtraction(@PathVariable int a , @PathVariable int b){

        int sub=a-b;
        return "Subtraction Value:- "+a+ " - " +b+ " = " +sub;
    }
    @RequestMapping("/mul")
    public String multiplication(){
        int a=5; int b=5;
        int mul = a*b;
        return "Multiplication Value:- "+a+ " * " +b+ " = " +mul;
    }
    @RequestMapping("/div")
    public String divide(){
        int a=30; int b=5;
        int div = a/b;
        return "Divide Value:- "+a+ " / " +b+ " = " +div;
    }
}
