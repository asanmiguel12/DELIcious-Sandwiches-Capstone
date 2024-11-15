package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.Order.chips;

public class Chips {

    Scanner scanner = new Scanner(System.in);
    public void getChips(){
        System.out.println("Would You Like To Add Chips? (Y/N)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            chips.add("Chips");
        } if (choice.equalsIgnoreCase("N")) {
            Order order = new Order();
            order.orderMenu();

        }
    }
}
