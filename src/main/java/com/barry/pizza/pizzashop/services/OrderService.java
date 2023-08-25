package com.barry.pizza.pizzashop.services;

import org.springframework.stereotype.Service;

import com.barry.pizza.pizzashop.models.Pizza;


@Service
public class OrderService {
    
    public double calculateCostForPizza(Pizza pizza){
        double cost = 10.00;

        switch (pizza.getSize()) {
            case LARGE:
                cost+=10.00;
                break;
            case EXTRA_LARGE:
                cost+=15.00;
                break;
            case MEDIUM:
                cost+=7.00;
                break;
            default:
                cost+=5.00;
                break;
        }
    
        return cost;
    }

}