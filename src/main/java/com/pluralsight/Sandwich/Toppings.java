package com.pluralsight.Sandwich;

import com.pluralsight.Order;

import java.util.List;
import java.util.Scanner;
import static com.pluralsight.Sandwich.Sandwich.*;

public class Toppings {
    List<String> veggies = List.of("Lettuce", "Onions", "Tomatoes", "Jalapenos", "Cucumbers",
            "Pickles", "Guacamole", "Mushrooms");

    Scanner scanner = new Scanner(System.in);
    public String getPremiumToppings() {
            System.out.println("~PREMIUM TOPPINGS~" + "\n" +
                    "Please Choose Your Premium Toppings " + "\n" +
                    "1) Meat" + "\n" +
                    "2) Cheese" + "\n" +
                    "3) Finished");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Meat meat = new Meat();
                    premiumToppings.add(meat.getMeat());
                    premiumToppings.add(meat.getExtraMeat());
                    System.out.println("Your Premium Toppings: " + premiumToppings);
                    getPremiumToppings();
                case 2:
                    Cheese cheese = new Cheese();
                    premiumToppings.add(cheese.getCheese());
                    premiumToppings.add(cheese.getExtraCheese());
                    System.out.println("Your Premium Toppings: " + premiumToppings);
                    getPremiumToppings();
                case 3:
                    Toppings toppings = new Toppings();
                    System.out.println("Looks DELIcious So Far!");
                    toppings.getRegularToppings();
                    break;
            }
            return null;
        }

    public String getRegularToppings() {
        System.out.println("~REGULAR TOPPINGS~" + "\n" +
                "Please Choose Your Regular Toppings " + "\n" +
                "1) Veggies" + "\n" +
                "2) Sauce" + "\n" +
                "3) Finished");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                regularToppings.add(selectVeggies());
                System.out.println("Your Regular Toppings: " + regularToppings);
                getRegularToppings();
            case 2:
                Sauce sauce = new Sauce();
                regularToppings.add(sauce.getSauce());
                System.out.println("Your Regular Toppings: " + regularToppings);
                getRegularToppings();
            case 3:
                Order order = new Order();
                System.out.println("Looks DELIcious So Far!");
                order.orderMenu();
                break;
        }
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String selectVeggies() {
        System.out.println("~VEGGIES~" + "\n" +
                "Please Enter The Type Of Veggies You Want:" + "\n" +
                "\"Lettuce\", \"Onions\", \"Tomatoes\", \"Jalapenos\" \"Cucumbers\" , " +
                        "\"Pickles\" , \"Guacamole\" , \"Mushrooms\"");

        String veggiesChoice = scanner1.nextLine();
        int veggiesCount = 0;

        for (String veggiesName : veggies) {
            if (veggiesChoice.equalsIgnoreCase(veggiesName)) {
                veggiesCount++;
                System.out.println("Current Sandwich: " + breadTypeAndSize);
                System.out.println("Your Premium Toppings: " + premiumToppings);
                System.out.println("Added Veggies: " + veggiesName + " " + "x" + veggiesCount);
                return "Veggies: " + veggiesName + " " + "x" + veggiesCount;
            }
        }
        return null;
    }
}