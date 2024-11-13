package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    static List<String> sandwich = new ArrayList<>();
    public void checkout(){
        Sandwich sandwich1 = new Sandwich();
        sandwich.add(sandwich1.getBreadType());
        System.out.println(sandwich);
    }
}
