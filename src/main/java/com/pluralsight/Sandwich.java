package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    private String breadSize;
    private String breadType;
    static Bread bread = new Bread();
    static Toppings toppings = new Toppings();
    static List<String> sandwich = new ArrayList<>();

    public Sandwich() {

    }

    static Scanner scanner = new Scanner(System.in);
    public List<String> getSandwich() {

        sandwich.add(bread.getBreadSize());
        System.out.println(sandwich);
        sandwich.add(bread.getBreadType());
        System.out.println(sandwich);
        sandwich.add(toppings.getToppings());
        System.out.println(sandwich);

        return sandwich;
    }

    public List<String> addSandwich() {
        System.out.println("Would You Like To Add Another Sandwich? (Y/N)");

        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            return getSandwich();
        }
        return  null;
    }
}
