package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;
import static com.pluralsight.Sandwich.Sandwich.*;


public class Cheese{
    private String name;
    private double price;
    Toppings toppings = new Toppings();
    List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");

    Scanner scanner = new Scanner(System.in);
    public String getCheese() {
        System.out.println("~CHEESE~" + "\n" +
                "Please Enter The Type Of Cheese You Want:" + "\n" +
                "\"American\", \"Provolone\", \"Cheddar\", \"Swiss\"");

        String cheeseChoice = scanner.nextLine();
        int cheeseCount = 0;

        for (String cheeseName : cheeses) {
            if (cheeseChoice.equalsIgnoreCase(cheeseName)) {
                cheeseCount++;
                return "Cheese: " + cheeseName + " " + "x" + cheeseCount;
            }
        }
        scanner.close();
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getExtraCheese(){
        System.out.println("Would You Like To Add Extra Cheese? (Y/N)");

        String choice = scanner1.nextLine();
        int extraCheeseCount = 0;

        if (choice.equalsIgnoreCase("Y")) {
            extraCheeseCount++;
            System.out.println("Current Sandwich: " + breadTypeAndSize);
            System.out.println("Added Extra Cheese: " + "x" + extraCheeseCount);
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
        if (breadTypeAndSize.contains("Sandwich Size: 4 Inches Price: $5.5")) {
            return this.price = 0.75;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 8 Inches Price: $7.0")) {
            return this.price = 1.50;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 12 Inches Price: $8.5")) {
            return this.price = 2.25;
        }
        return this.price = 0;
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

