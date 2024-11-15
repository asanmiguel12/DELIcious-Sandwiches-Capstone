package com.pluralsight;

import com.pluralsight.Sandwich.Bread;
import com.pluralsight.Sandwich.Meat;
import com.pluralsight.Sandwich.Toppings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    public static List<String> premiumToppings = new ArrayList<>();
    public static List<String> regularToppings = new ArrayList<>();
    public static List<String> breadTypeAndSize = new ArrayList<>();
    public static List<String> drink = new ArrayList<>();
    public static List<String> chips = new ArrayList<>();
    private double price;

    public Order(List<String> RegularToppings, List<String> drink, List<String> chips, double price) {
        this.regularToppings = RegularToppings;
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
                 getSandwich();
            case 2:
                return drink.getDrink();
            case 3:
                 chips.getChips();
            case 4:
                checkout();
                break;
            default:
                System.out.println("Invalid Input " +
                        "Please Try Again");

        }
        return null;
    }

    public String getSandwich() {

        Bread bread = new Bread();
        Toppings toppings = new Toppings();

        breadTypeAndSize.add(bread.getBreadSize());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        breadTypeAndSize.add(bread.getBreadType());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        toppings.getPremiumToppings();
        toppings.getRegularToppings();

        return "Your DELIcious Sandwich:" + "\n" +
                breadTypeAndSize + "\n" +
                premiumToppings + "\n" +
                regularToppings;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String addSandwich() {
        System.out.println("Would You Like To Add Another Sandwich? (Y/N)");

        String choice = scanner1.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            return getSandwich();
        }
        return null;
    }

    Scanner scanner2 = new Scanner(System.in);
    public void checkout() {
        System.out.println("Cart: " + "Your DELIcious Sandwich:" + "\n" +
                breadTypeAndSize + "\n" +
                premiumToppings + "\n" +
                regularToppings);
        
        System.out.println("Would You Like To Confirm Your Order? (Y/N)");

        String choice = scanner2.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            try {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmmss");

                String newFile = now.format(dateFormatter) + "-" + now.format(timeFormatter);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile + "Receipt"));
                bufferedWriter.write(String.valueOf(regularToppings));
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        } if (choice.equalsIgnoreCase("N")) {
            orderMenu();
        }
    }

    public void getTotal() {
        Toppings toppings = new Toppings();
        Meat meat = new Meat();
        System.out.println("Total:" + meat.getPrice());
        toppings.getRegularToppings();

    }
}
