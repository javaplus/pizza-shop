package com.barry.pizza.pizzashop.models;

import java.util.HashMap;
import java.util.Map;


public class PizzaSizeCost {
   public static Map<PizzaSize, Double> pizzaSizeCostMap = new HashMap<>();

   public PizzaSizeCost(){
    pizzaSizeCostMap.put(PizzaSize.LARGE, 10.00);
    pizzaSizeCostMap.put(PizzaSize.EXTRA_LARGE, 15.00);
    pizzaSizeCostMap.put(PizzaSize.MEDIUM, 7.00);
    pizzaSizeCostMap.put(PizzaSize.SMALL, 5.00);

   }
}