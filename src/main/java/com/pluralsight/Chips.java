package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Chips {
    public static List<String> chips = new ArrayList<>();
    List<String> chipChoices = List.of("Barbeque", "Sour Cream & Onion", "Spicy");
    private double price;


    Scanner scanner = new Scanner(System.in);
    public String getChips(){

        System.out.println("Would You Like To Add Chips? (Y/N)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                    "\"Barbeque\", \"Sour Cream & Onion\", \"Spicy\"");

            String chipsChoice = scanner.nextLine();
            int chipsCount = 0;
            double price = 1.50;

            for(String chipsName : chipChoices) {
                if (chipsChoice.equalsIgnoreCase(chipsName)) {
                    chipsCount++;
                    System.out.println("Chips: " + chipsName + " " + "x" + chipsCount + " Price: $" + price);
                    chips.add("Drink: " + chipsName + " " + "x" + chipsCount + " Price: $" + price);
                    Order order = new Order();
                    order.orderMenu();
                    return "Chips: " + chipsName + " " + "x" + chipsCount + " Price: $" + price;
                }
            }
        }
        if (choice.equalsIgnoreCase("N")) {
            Order order = new Order();
            order.orderMenu();
        }
        scanner.close();
        return null;
    }

    public double getPrice() {
        return price = 1.50;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
