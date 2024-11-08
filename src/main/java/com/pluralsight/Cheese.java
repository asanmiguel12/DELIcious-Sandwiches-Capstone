package com.pluralsight;

public class Cheese {
    private String name;
    private double price;

    public Cheese(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCheese () {
        return getName();

    }
}
