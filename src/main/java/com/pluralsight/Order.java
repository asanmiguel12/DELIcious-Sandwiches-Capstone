package com.pluralsight;

import com.pluralsight.Sandwich.Bread;
import com.pluralsight.Sandwich.Meat;
import com.pluralsight.Sandwich.Toppings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    public static List<String> sandwich = new ArrayList<>();
    private Drink drink;
    private Chips chips;
    private double price;

    public Order(List<String> sandwich, Drink drink, Chips chips, double price) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.chips = chips;
    }

    public Order () {

    }

    static Scanner scanner = new Scanner(System.in);
    public List<String> orderMenu() {
        System.out.println("~ORDER~" + "\n" +
                "1) Add Sandwich" + "\n" +
                "2) Add Drink" + "\n" +
                "3) Add Chips" + "\n" +
                "4) Checkout" + "\n" +
                "0) Cancel Order");

        int choice = scanner.nextInt();
        Drink drink = new Drink();
        Chips chips = new Chips();

        switch (choice) {
            case 1:
                return getSandwich();
            case 2:
                return drink.getDrink();
            case 3:
                return chips.getChips();
            case 4:
                checkout();
                break;
            default:
                System.out.println("Invalid Input " +
                        "Please Try Again");

        }
        return null;
    }

    public List<String> getSandwich() {

        Bread bread = new Bread();
        Toppings toppings = new Toppings();

        sandwich.add(bread.getBreadSize());
        System.out.println("Current Sandwich: " + sandwich);
        sandwich.add(bread.getBreadType());
        System.out.println("Current Sandwich: " + sandwich);
        toppings.getPremiumToppings();

        return sandwich;

    }

    Scanner scanner1 = new Scanner(System.in);
    public List<String> addSandwich() {
        System.out.println("Would You Like To Add Another Sandwich? (Y/N)");

        String choice = scanner1.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            return getSandwich();
        }
        return  null;
    }

    public void checkout() {
        System.out.println("Cart: " + sandwich);
        System.out.println("Would You Like To Confirm Your Order?");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Receipts"));
            bufferedWriter.write(String.valueOf(sandwich));
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void getTotal() {
        Toppings toppings = new Toppings();
        Meat meat = new Meat();
        System.out.println("Total:" + meat.getPrice());
        toppings.getRegularToppings();

    }
}
