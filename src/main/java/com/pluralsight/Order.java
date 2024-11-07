package com.pluralsight;

import java.util.Scanner;

public class Order {
    static Scanner scanner = new Scanner(System.in);
    public void orderMenu() {
        System.out.println("~ORDER~" + "\n" +
                "1) Add Sandwich" + "\n" +
                "2) Add Drink" + "\n" +
                "3) Add Chips" + "\n" +
                "4) Checkout" + "\n" +
                "0) Cancel Order");

        int choice = scanner.nextInt();
        Sandwich sandwich = new Sandwich();

        switch (choice) {
            case 1:
                sandwich.getSize();
            case 2:


        }

    }
}
