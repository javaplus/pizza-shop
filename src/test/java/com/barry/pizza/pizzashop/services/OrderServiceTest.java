package com.barry.pizza.pizzashop.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.barry.pizza.pizzashop.models.Pizza;
import com.barry.pizza.pizzashop.models.PizzaSize;

public class OrderServiceTest {

   
    private OrderService orderService = new OrderService();

    @Test
    public void whenCalculatingCostForLargePizzaReturns20(){

        Pizza pizza = new Pizza();
        pizza.setSize(PizzaSize.LARGE);

        double cost = orderService.calculateCostForPizza(pizza);

        assertEquals(20.00, cost);
    }

}