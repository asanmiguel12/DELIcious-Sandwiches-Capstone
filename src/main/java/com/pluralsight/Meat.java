package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Meat implements PremiumToppings{
    private String name;
    private double price;
    static List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");

    public Meat(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Meat(){

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
    public String selectMeat() {
        System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                "\"Steak\", \"Ham\", \"Salami\", \"Roast Beef\", \"Chicken\", \"Bacon\"");

        String meatChoice = scanner.nextLine();

        for (String meatName : meats) {
            if (meatChoice.equalsIgnoreCase(meatName)) {
                System.out.println("Meat: " + meatChoice);
                ToppingsAndSauce toppingsAndSauce = new ToppingsAndSauce();
                toppingsAndSauce.getToppings();
                return meatChoice;
            } else if (meatChoice != meatName) {
                System.out.println("Not Found Please Try Again");
                selectMeat();
                break;
            }

            }

        return null;
    }


    @Override
    public double isPremium() {
        return price = 1 ;

    }
}
