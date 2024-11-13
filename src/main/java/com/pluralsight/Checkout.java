package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    static List<String> sandwich = new ArrayList<>();
    public void checkout(){
        Toppings toppings = new Toppings();
        sandwich.add(String.valueOf(toppings.finished()));
        getTotal();
    }
    public void getTotal() {
        Toppings toppings = new Toppings();
        Meat meat = new Meat();
        System.out.println("Total:" + meat.getPrice());
        toppings.getToppings();

    }
}
