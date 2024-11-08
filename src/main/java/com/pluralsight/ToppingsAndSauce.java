package com.pluralsight;

import java.util.Scanner;

public class ToppingsAndSauce {

    Scanner scanner = new Scanner(System.in);

    public String getToppings() {
        System.out.println("Please Choose Your Toppings " + "\n" +
                "1) Meat" + "\n" +
                "2) Cheese" + "\n" +
                "3) Veggies");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Meat meat = new Meat();
                return meat.selectMeat();
            case 2:


        }

        return null;
    }


    public String getSauce() {
        return getSauce();

    }
}