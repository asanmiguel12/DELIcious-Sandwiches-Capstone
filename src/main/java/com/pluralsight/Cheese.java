package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Cheese implements PremiumToppings{
    private String name;
    private double price;
    static List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");

    public Cheese(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Cheese(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Scanner scanner = new Scanner(System.in);
    public String getCheese() {
        System.out.println("Please Enter The Type Of Cheese You Want:" + "\n" +
                "\"American\", \"Provolone\", \"Cheddar\", \"Swiss\"");

        String cheeseChoice = scanner.nextLine();
        int cheeseCount = 0;

        for (String cheeseName : cheeses) {
            if (cheeseChoice.equalsIgnoreCase(cheeseName)) {
                cheeseCount++;
                System.out.println("Cheese: " + cheeseChoice + " " + "x" + cheeseCount);
                return cheeseChoice;
            }
        }
        return null;
    }


    @Override
    public double isPremium() {
        return price = .75 ;

    }
}

