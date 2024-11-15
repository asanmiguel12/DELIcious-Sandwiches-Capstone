package com.pluralsight;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Order.chips;

public class Chips {

    Scanner scanner = new Scanner(System.in);
    List<String> chips = List.of("Barbeque", "Sour Cream & Onion", "Spicy");

    public String getChips(){

        System.out.println("Would You Like To Add Chips? (Y/N)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                    "\"Barbeque\", \"Sour Cream & Onion\", \"Spicy\"");

            String chipsChoice = scanner.nextLine();
            int chipsCount = 0;
            double price = 1.50;

            for(String chipsName : chips) {
                if (chipsChoice.equalsIgnoreCase(chipsName)) {
                    chipsCount++;
                    System.out.println("Chips: " + chipsName + " " + "x" + chipsCount + " Price: $" + price);
                    return "Chips: " + chipsName + " " + "x" + chipsCount + " Price: $" + price;
                }
            }
        }
        if (choice.equalsIgnoreCase("N")) {
            Order order = new Order();
            order.orderMenu();
        }
        return null;
    }
}
