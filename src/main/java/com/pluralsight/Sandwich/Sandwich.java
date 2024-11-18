package com.pluralsight.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sandwich {
    public static List<String> breadTypeAndSize = new ArrayList<>();
    public static List<String> premiumToppings = new ArrayList<>();
    public static List<String> regularToppings = new ArrayList<>();

    public static List<String> breadTypeAndSize2 = new ArrayList<>();
    public static List<String> premiumToppings2 = new ArrayList<>();
    public static List<String> regularToppings2 = new ArrayList<>();

    public String getSandwich() {

        Bread bread = new Bread();
        Toppings toppings = new Toppings();

        breadTypeAndSize.add(bread.getBreadSize());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        breadTypeAndSize.add(bread.getBreadType());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        toppings.getPremiumToppings();
        toppings.getRegularToppings();
        isToasted();


        return "Your DELIcious Sandwich:" + "\n" +
                breadTypeAndSize + "\n" +
                premiumToppings + "\n" +
                regularToppings;
    }

    public String getSandwich2() {

        Bread bread = new Bread();
        Toppings toppings = new Toppings();

        breadTypeAndSize2.add(bread.getBreadSize());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        breadTypeAndSize2.add(bread.getBreadType());
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        premiumToppings2.add(toppings.getPremiumToppings());
        regularToppings2.add(toppings.getRegularToppings());

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
            return getSandwich2();
        } else {
            System.out.println("Invalid Input Please Try Again");
            addSandwich();
        }
        scanner1.close();
        return null;
    }

    Scanner scanner2 = new Scanner(System.in);
    public void isToasted() {
        System.out.println("Would You Like Your Sandwich Toasted? (Y/N)");

        String choice = scanner2.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            breadTypeAndSize.add("Toasted");
            System.out.println("Your DELIcious Sandwich:" + "\n" +
                    breadTypeAndSize + "\n" +
                    premiumToppings + "\n");
        }
    }

    public static void currentSandwich () {
        System.out.println("Current Sandwich: " + breadTypeAndSize);
        System.out.println("Your Premium Toppings: " + premiumToppings);
        System.out.println("Your Regular Toppings: " + regularToppings);

    }
}