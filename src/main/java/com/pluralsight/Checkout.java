package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    static List<String> sandwich = new ArrayList<>();
    public void checkout(){
        Sandwich sandwich1 = new Sandwich();
        Toppings toppings = new Toppings();
        sandwich.add(String.valueOf(toppings.finished()));
    }
    public void getTotal() {
        Toppings toppings = new Toppings();
        toppings.getToppings();
    }
}
