package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

import static com.pluralsight.Order.drink;

public class Drink {
    HashMap<String, Double> drinks = new HashMap<>();

    public void addDrinkElements() {
        drinks.put("Small", 2.00);
        drinks.put("Medium", 2.50);
        drinks.put("Large", 3.00);
    }

    Scanner scanner = new Scanner(System.in);
    public String getDrink(){

        drinks.put("Small", 2.00);
        drinks.put("Medium", 2.50);
        drinks.put("Large", 3.00);

        System.out.println("Would You Like To Add A Drink? (Y/N)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Please Enter The Size Of Drink You Want:" + "\n" +
                    "\"Small\", \"Medium\", \"Large\"");

            String drinkChoice = scanner.nextLine();
            int drinksCount = 0;


            for(String drinkName : drinks.keySet())
                if (drinkChoice.equalsIgnoreCase(drinkName)) {
                    drinksCount++;
                    System.out.println("Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinks.values());
                    drink.add("Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinks.values());
                    Order order = new Order();
                    order.orderMenu();
                    return "Drink: " + drinkName + " " + "x" + drinksCount + " Price: $" + drinks.values();
                }
            }
        if (choice.equalsIgnoreCase("N")) {
            Order order = new Order();
            order.orderMenu();
        }
        return null;
    }
}
