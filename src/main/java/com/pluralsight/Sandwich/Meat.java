package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;
import static com.pluralsight.Sandwich.Sandwich.*;

public class Meat{
    private String name;
    private double price;
    private double extraPrice;
    Toppings toppings = new Toppings();
    List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");


    Scanner scanner = new Scanner(System.in);
    public String getMeat() {

        System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                "\"Steak\", \"Ham\", \"Salami\", \"Roast Beef\", \"Chicken\", \"Bacon\"");
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
    public String getExtraMeat() {
        System.out.println("Would You Like To Add Extra Meat? (Y/N)");

        String choice = scanner1.nextLine();
        int extraMeatCount = 0;

        if (choice.equalsIgnoreCase("Y")) {
            extraMeatCount++;
            displayCurrentSandwich();
            System.out.println("Added Extra Meat: " + "x" + extraMeatCount);
            return "Extra Meat: " + "x" + extraMeatCount;
        }
        if (choice.equalsIgnoreCase("N")) {
            displayCurrentSandwich();
            toppings.getPremiumToppings();
        }
        scanner1.close();
        return null;
    }

    public double getPrice() {
        if (breadTypeAndSize.contains("Sandwich Size: 4 Inches Price: $5.5")) {
            return this.price = 1.00;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 8 Inches Price: $7.0")) {
            return this.price = 2.00;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 12 Inches Price: $8.5")) {
            return this.price = 3.00;
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
