package com.barry.pizza.pizzashop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barry.pizza.pizzashop.models.Pizza;
import com.barry.pizza.pizzashop.services.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    // @Autowired
    // public OrderController(OrderService orderService){

    //     this.orderService = orderService;
    // }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
    
    @PostMapping("/order")
    public String orderPizza(@RequestBody Pizza pizza){

        double cost = orderService.calculateCostForPizza(pizza);
        System.out.println("Pizza size:" + pizza.getSize());


        
        return "Ordered Total: " + cost;
    }

}