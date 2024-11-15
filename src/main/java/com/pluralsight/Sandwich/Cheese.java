package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Order.breadTypeAndSize;
import static com.pluralsight.Order.premiumToppings;

public class Cheese{
    private String name;
    private double price;
    Toppings toppings = new Toppings();
    List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");

    public Cheese() {

    }

    Scanner scanner = new Scanner(System.in);
    public String getCheese() {
        System.out.println("~CHEESE~" + "\n" +
                "Please Enter The Type Of Cheese You Want:" + "\n" +
                "\"American\", \"Provolone\", \"Cheddar\", \"Swiss\"");

        String cheeseChoice = scanner.nextLine();
        int cheeseCount = 0;
        double cost = 0;

        for (String cheeseName : cheeses) {
            if (cheeseChoice.equalsIgnoreCase(cheeseName)) {
                cheeseCount++;
                return "Cheese: " + cheeseName + " " + "x" + cheeseCount;
            }
        }
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getExtraCheese(){
        System.out.println("Would You Like To Add Extra Cheese? (Y/N)");

        String choice = scanner1.nextLine();
        int extraCheeseCount = 0;
        double price = .75;

        if (choice.equalsIgnoreCase("Y")) {
            extraCheeseCount++;
            System.out.println("Current Sandwich: " + breadTypeAndSize);
            System.out.println("Added Extra Cheese: " + "x" + extraCheeseCount + price);
            return "Extra Cheese: " + "x" + extraCheeseCount;
        }
        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Current Sandwich: " + breadTypeAndSize);
            System.out.println("Your Premium Toppings: " + premiumToppings);
            toppings.getPremiumToppings();
        }
        toppings.getPremiumToppings();
        return null;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

