package com.pluralsight;

import java.util.Scanner;

public class Order {
    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;
    private double price;

    public Order(Sandwich sandwich, Drink drink, Chips chips, double price) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.chips = chips;
    }

    public Order () {

    }

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
        Toppings toppings = new Toppings();
        Drink drink = new Drink();
        Chips chips = new Chips();
        Checkout checkout = new Checkout();

        switch (choice) {
            case 1:
                sandwich.getSandwich();
                toppings.getToppings();
                break;
            case 2:
                drink.getDrink();
                break;
            case 3:
                chips.getChips();
                break;
            case 4:
                checkout.checkout();
                break;
            default:
                System.out.println("Invalid Input " +
                        "Please Try Again");

        }
    }
}
