package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Drink {
    public static List<String> drinks = new ArrayList<>();
    HashMap<String, Double> drinkChoices = new HashMap<>();
    private double price;

    Scanner scanner = new Scanner(System.in);
    public String getDrink(){

        drinkChoices.put("Small", 2.00);
        drinkChoices.put("Medium", 2.50);
        drinkChoices.put("Large", 3.00);

        System.out.println("Would You Like To Add A Drink? (Y/N)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Please Enter The Size Of Drink You Want:" + "\n" +
                    "\"Small\", \"Medium\", \"Large\"");

            String drinkChoice = scanner.nextLine();
            int drinksCount = 0;


            for(String drinkName : drinkChoices.keySet())
                if (drinkChoice.equalsIgnoreCase(drinkName)) {
                    drinksCount++;
                    System.out.println("Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinkChoices.values());
                    drinks.add("Drink: " + drinkName + " " + "x" + drinksCount);
                    Order order = new Order();
                    order.orderMenu();
                    return "Drink: " + drinkName + " " + "x" + drinksCount;
                } else {
                    System.out.println("Invalid Input Please Try Again");
                    getDrink();
                }
            }
        if (choice.equalsIgnoreCase("N")) {
            Order order = new Order();
            order.orderMenu();
        } else {
            System.out.println("Invalid Input Please Try Again");
            getDrink();
        }
        scanner.close();
        return null;
    }

    public double getPrice() {
        if (drinks.contains("Drink: Small x1")) {
            return this.price = 2.00;
        }
        if (drinks.contains("Drink: Medium x1")) {
            return this.price = 2.50;
        }
        if (drinks.contains("Drink: Large x1")) {
            return this.price = 3.00;
        }
        return this.price = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
