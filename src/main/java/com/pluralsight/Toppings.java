package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toppings {
    static List<String> veggies = List.of("Lettuce", "Onions", "Tomatoes", "Jalapenos", "Cucumbers",
            "Pickles", "Guacamole", "Mushrooms");
    static List<String> toppingsList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    public String getToppings() {
        System.out.println("Please Choose Your Toppings " + "\n" +
                "1) Meat" + "\n" +
                "2) Cheese" + "\n" +
                "3) Veggie" + "\n" +
                "4) Sauce" + "\n" +
                "5) Finished");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Meat meat = new Meat();
                toppingsList.add(meat.getMeat());
                System.out.println("Your Sandwich: " + toppingsList);
                getToppings();
                break;
            case 2:
                Cheese cheese = new Cheese();
                toppingsList.add(cheese.getCheese());
                System.out.println("Your Sandwich: " + toppingsList);
                getToppings();
                break;
            case 3:
                toppingsList.add(selectVeggies());
                System.out.println("Your Sandwich: " + toppingsList);
                getToppings();
            case 4:
                Sauce sauce = new Sauce();
                toppingsList.add(sauce.getSauce());
                System.out.println("Your Sandwich: " + toppingsList);
                getToppings();
                break;
            case 5:
                Order order = new Order();
                finished();
                order.orderMenu();
                break;
        }
        return null;
    }
    Scanner scanner1 = new Scanner(System.in);
    public String selectVeggies() {
        List<String> veggies = List.of("Lettuce", "Onions", "Tomatoes", "Jalapenos", "Cucumbers",
                "Pickles", "Guacamole", "Mushrooms");
        System.out.println("Please Enter The Type Of Cheese You Want:" + "\n" +
                "\"Lettuce\", \"Onions\", \"Tomatoes\", \"Jalapenos\"");

        String veggiesChoice = scanner1.nextLine();
        int veggiesCount = 0;

        for (String cheeseName : veggies) {
            if (veggiesChoice.equalsIgnoreCase(cheeseName)) {
                veggiesCount++;
                System.out.println("Veggies: " + veggiesChoice + " " + "x" + veggiesCount);
                return "Veggies: " + veggiesChoice + " " + "x" + veggiesCount;
            }
        }
        return null;
    }

    public List<String> finished(){
        System.out.println("Your Sandwich: " + toppingsList);
        return toppingsList;
    }
}