package com.pluralsight;

import com.pluralsight.Sandwich.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Drink.drinks;
import static com.pluralsight.Sandwich.Sandwich.*;

public class Order {
    public static List<String> chips = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    public List<String> orderMenu() {
        System.out.println("~ORDER~" + "\n" +
                "1) Add DELIcious Sandwich" + "\n" +
                "2) Add Additional DELIcious Sandwich" + "\n"+
                "3) Add DELIcious Drink" + "\n" +
                "4) Add DELIcious Chips" + "\n" +
                "5) Checkout" + "\n" +
                "0) Cancel Order");

        int choice = scanner.nextInt();
        Drink drink = new Drink();
        Chips chips1 = new Chips();
        Sandwich sandwich = new Sandwich();


        switch (choice) {
            case 1:
                 sandwich.getSandwich();
                 break;
            case 2:
                 sandwich.addSandwich();
            case 3:
                 drink.getDrink();
                 break;
            case 4:
                 chips1.getChips();
                 break;
            case 5:
                getTotal();
                checkout();
                break;
            case 6:
                breadTypeAndSize.clear();
                premiumToppings.clear();
                regularToppings.clear();
                drinks.clear();
                chips.clear();
                Home home = new Home();
                home.homeMenu();
                break;
            default:
                System.out.println("Invalid Input Please Try Again");
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
                String total = getTotal();

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile + " " + "DELIcious Receipt"));
                bufferedWriter.write(breadTypeAndSize + "\n" +
                        premiumToppings + "\n" +
                        regularToppings + "\n" +
                        chips + "\n" +
                        drinks + "\n" +
                        total);
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Error ");
                e.printStackTrace();
            }
        } if (choice.equalsIgnoreCase("N")) {
            orderMenu();
        }
    }

    public String getTotal() {
        Bread bread = new Bread();
        Meat meat = new Meat();
        Cheese cheese = new Cheese();

        if (breadTypeAndSize.contains("Sandwich Size: 4 Inches Price: $5.5")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + .50;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 8 Inches Price: $7.0")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + .75;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 12 Inches Price: $8.5")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + 1.50;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        double total = meat.getPrice() + cheese.getPrice() + bread.getPrice();
        System.out.println("Total: $" + total);
        return "Total: $" + total;
    }
}
