package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Order.premiumToppings;
import static com.pluralsight.Order.regularToppings;

public class Meat{
    private String name;
    private double price;
    Toppings toppings = new Toppings();
    List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");

    public Meat(){

    }

    Scanner scanner = new Scanner(System.in);
    public String getMeat() {

        System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                "\"Steak\", \"Ham\", \"Salami\", \"Roast Beef\", \"Chicken\", \"Bacon\"" + this.price);
        String meatChoice = scanner.nextLine();
        int meatCount = 0;
        this.price = 0;

        for (String meatName : meats) {
            if (meatChoice.equalsIgnoreCase(meatName)) {
                meatCount++;
                this.price++;
                return "Meat: " + meatName + " " + "x" + meatCount + " Price: $" + this.price;
            }

        }
        scanner.close();
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getExtraMeat(){
        System.out.println("Would You Like To Add Extra Meat? (Y/N)");

        String choice = scanner1.nextLine();
        int extraMeatCount = 0;
        double price = 0;

        if (choice.equalsIgnoreCase("Y")) {
            price = .50;
            extraMeatCount++;
            System.out.println("Added Extra Meat: " + "x" + extraMeatCount + " Price: $" + price);
            return "Extra Meat: " + "x" + extraMeatCount + " Price: $" + price;
        }
        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Your Premium Toppings: " + premiumToppings);
            toppings.getPremiumToppings();
        }
        toppings.getPremiumToppings();
        return null;
    }

    public double getPrice() {
        return this.price;
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
