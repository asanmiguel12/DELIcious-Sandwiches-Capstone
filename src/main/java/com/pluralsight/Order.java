package com.pluralsight;

import com.pluralsight.Sandwich.Meat;
import com.pluralsight.Sandwich.Sandwich;
import com.pluralsight.Sandwich.Toppings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Sandwich.Sandwich.*;

public class Order {
    public static List<String> chips = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    public List<String> orderMenu() {
        System.out.println("~ORDER~" + "\n" +
                "1) Add DELIcious Sandwich" + "\n" +
                "2) Add Additional DELIcious Sandwich" + "\n"+
                "3) Add Drink" + "\n" +
                "4) Add Chips" + "\n" +
                "5) Checkout" + "\n" +
                "0) Cancel Order");

        int choice = scanner.nextInt();
        Drink drink = new Drink();
        Chips chips = new Chips();
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
                 chips.getChips();
                 break;
            case 5:
                checkout();
                break;
            case 6:
                Home home = new Home();
                Home.exit();
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

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile + "Receipt"));
                bufferedWriter.write(breadTypeAndSize + "\n" +
                        premiumToppings + "\n" +
                        regularToppings);
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Error ");
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
