package com.barry.pizza.pizzashop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barry.pizza.pizzashop.models.Pizza;

@RestController
public class OrderController {


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
    
    @PostMapping("/order")
    public String orderPizza(@RequestBody Pizza pizza){
        System.out.println("Pizza size:" + pizza.getSize());
        return "Ordered";
    }

}