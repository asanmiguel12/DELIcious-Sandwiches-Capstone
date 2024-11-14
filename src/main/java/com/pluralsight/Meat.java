package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Meat{
    private String name;
    private double price;
    static Bread bread = new Bread();
    static List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");

    public Meat(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Scanner scanner = new Scanner(System.in);
    public String getMeat() {
        System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                "\"Steak\", \"Ham\", \"Salami\", \"Roast Beef\", \"Chicken\", \"Bacon\"");

        String meatChoice = scanner.nextLine();
        int meatCount = 0;
        price = 0;

        for (String meatName : meats) {
            if (meatChoice.equalsIgnoreCase(meatName)) {
                meatCount++;
                price++;
                return "Meat: " + meatName + " " + "x" + meatCount + " " + "Price: " + price;
            }

            }
        scanner.close();
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getExtraMeat(){
        System.out.println("Would You Like To Add Extra Meat? (Y/N)");

        Toppings toppings = new Toppings();
        String choice = scanner1.nextLine();
        int extraMeatCount = 0;

        if (choice.equalsIgnoreCase("Y")) {
            extraMeatCount++;
            System.out.println("Extra Meat: " + "x" + extraMeatCount);
            return "Extra Meat: " + "x" + extraMeatCount;
        }
        if (choice.equalsIgnoreCase("N")) {
            toppings.getToppings();
        }
        toppings.getToppings();
        return null;
    }
}
