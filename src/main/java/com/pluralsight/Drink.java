package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Drink {
    public static List<String> drink = new ArrayList<>();
    HashMap<String, Double> drinkChoices = new HashMap<>();

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
                    drink.add("Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinkChoices.values());
                    Order order = new Order();
                    order.orderMenu();
                    return "Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinkChoices.values();
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
}
