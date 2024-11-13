package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    private String breadSize;
    private String breadType;
    static List<String> sandwich = new ArrayList<>();
    private String toppings;
    private Sauce sauces;

    public Sandwich(String breadSize, String breadType, String toppings, Sauce sauces) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.toppings = toppings;
        this.sauces = sauces;
    }

    public Sandwich() {

    }

    static Scanner scanner = new Scanner(System.in);
    public String getBreadSize() {

        System.out.println("~SANDWICH~" + "\n" +
                "What size sandwich would you like" + "\n" +
                "1) 4 Inches" + "\n" +
                "2) 8 Inches" + "\n" +
                "3) 12 Inches");

        int choice = scanner.nextInt();

        String size1 = "4 Inches";
        String size2 = "8 Inches";
        String size3 = "12 Inches";
        Toppings toppings = new Toppings();

        switch (choice) {
            case 1:
                System.out.println("Sandwich Size: 4 Inches");
                sandwich.add(getBreadType());
                sandwich.add(toppings.getToppings());
                size1 = breadSize;
                return size1;
            case 2:
                System.out.println("Sandwich Size: 8 Inches");
                sandwich.add(getBreadType());
                sandwich.add(toppings.getToppings());
                size2 = breadSize;
                return size2;
            case 3:
                System.out.println("Sandwich Size: 8 Inches");
                sandwich.add(getBreadType());
                sandwich.add(toppings.getToppings());
                size3 = breadSize;
                return size3;
            default:
                System.out.println("You Did Not Select A Size" +
                        "Please Input The Number Of The Size Sandwich You Would Like");
        }
        scanner.close();
        return null;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getBreadType() {
        List<String> breads = List.of("White", "Wheat", "Rye", "Wrap");
        System.out.println("Please Enter The Type Of Bread You Want:" + "\n" +
                "\"White\", \"Wheat\", \"Rye\", \"Wrap\"");

        String breadChoice = scanner1.nextLine();

        for (String breadName : breads) {
            if (breadChoice.equalsIgnoreCase(breadName)) {
                System.out.println("Bread: " + breadChoice);
                breadChoice = breadType;
                return breadChoice;
            }
        }
        return null;
    }

    public String addSandwich() {
        System.out.println("Would You Like To Add Another Sandwich? (Y/N)");

        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            return getBreadSize();
        }
        return  null;
    }
}
