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
    public void orderMenu() {
        System.out.println("~ORDER~" + "\n" +
                "1) Add DELIcious Sandwich" + "\n" +
                "2) Add Additional DELIcious Sandwich" + "\n"+
                "3) Add DELIcious Drink" + "\n" +
                "4) Add DELIcious Chips" + "\n" +
                "5) Checkout" + "\n" +
                "0) Cancel Order");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                 Sandwich sandwich = new Sandwich();
                 SignatureSandwich signatureSandwich = new SignatureSandwich();
                 signatureSandwich.signatureSandwichPrompt();
                 sandwich.getSandwich();
                 break;
            case 2:
                 Sandwich sandwich1 = new Sandwich();
                 SignatureSandwich signatureSandwich1 = new SignatureSandwich();
                 signatureSandwich1.signatureSandwichPrompt();
                 sandwich1.addSandwich();
                 break;
            case 3:
                 Drink drink = new Drink();
                 drink.getDrink();
                 break;
            case 4:
                 Chips chips1 = new Chips();
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
                orderMenu();
        }
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
                System.out.println("Thank You For Your DELIcious Order!");
                Home.exit();
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
        Drink drink = new Drink();
        Chips chips = new Chips();

        if (breadTypeAndSize.contains("Sandwich Size: 4 Inches Price: $5.5")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + drink.getPrice() + chips.getPrice() + .50;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 8 Inches Price: $7.0")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + drink.getPrice() + chips.getPrice() + .75;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 12 Inches Price: $8.5")
                && premiumToppings.contains("Extra Meat: x1")) {
            double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + drink.getPrice() + chips.getPrice() + 1.50;
            System.out.println("Total: $" + total);
            return "Total: $" + total;
        }
        double total = meat.getPrice() + cheese.getPrice() + bread.getPrice() + drink.getPrice() + chips.getPrice();
        System.out.println("Total: $" + total);
        return "Total: $" + total;
    }
}
