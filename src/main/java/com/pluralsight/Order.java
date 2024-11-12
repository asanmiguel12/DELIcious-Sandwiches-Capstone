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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
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

        switch (choice) {
            case 1:
                sandwich.getBreadSize();
                toppings.getToppings();
            case 2:


        }

    }
}
