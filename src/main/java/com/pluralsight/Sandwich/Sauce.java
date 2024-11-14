package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Order.sandwich;

public class Sauce {
    private String name;
    List<String> sauces = List.of("Mayo", "Mustard", "Ranch", "Ketchup",
                "Thousand Island", "Vinaigrette");

    public Sauce() {

    }

    Scanner scanner = new Scanner(System.in);
    public String getSauce() {
        System.out.println("Please Enter The Type Of Sauce You Want:" + "\n" +
                "\"Mayo\", \"Mustard\", \"Ranch\", \"Ketchup\", \"Thousand Island\", \"Vinaigrette\"");

        String sauceChoice = scanner.nextLine();
        int sauceCount = 0;

        for (String sauceName : sauces) {
            if (sauceChoice.equalsIgnoreCase(sauceName)) {
                sauceCount++;
                return "Sauce: " + sauceName +  " " + "x" + sauceCount;
            }
        }
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getExtraSauce(){
        System.out.println("Would You Like To Add Extra Sauce? (Y/N)");

        String choice = scanner1.nextLine();
        int extraCheeseCount = 0;
        double price = .75;

        if (choice.equalsIgnoreCase("Y")) {
            extraCheeseCount++;
            System.out.println("Extra Cheese: " + "x" + extraCheeseCount);
            return "Extra Cheese: " + "x" + extraCheeseCount;
        }
        if (choice.equalsIgnoreCase("N")) {
            Toppings toppings = new Toppings();
            System.out.println("Current Sandwich: " + sandwich);
            toppings.getRegularToppings();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sauce(String name) {
        this.name = name;
    }
}
