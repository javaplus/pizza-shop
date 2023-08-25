package com.barry.pizza.pizzashop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pizza {
    @Id
    private int id;
    private PizzaSize size;
    private String toppings;
    private String sauce;
}