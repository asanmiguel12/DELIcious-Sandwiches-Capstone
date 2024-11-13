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

    public Cheese() {
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
                return "Cheese: " + cheeseName + " " + "x" + cheeseCount;
            }
        }
        return null;
    }


    @Override
    public double isPremium() {
        return this.price = .75 ;

    }
}

