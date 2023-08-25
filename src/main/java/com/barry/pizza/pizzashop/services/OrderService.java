package com.barry.pizza.pizzashop.services;

import org.springframework.stereotype.Service;

import com.barry.pizza.pizzashop.models.Pizza;

@Service
public class OrderService {
    
    public double calculateCostForPizza(Pizza pizza){
        double cost = 10.00;
        if("LARGE".equalsIgnoreCase(pizza.getSize())){
            cost+=10.00;
        }else if("EXTRA LARGE".equalsIgnoreCase(pizza.getSize())){
            cost+=15.00;
        }else{
            cost+=5.00;
        }
    
        return cost;
    }

}