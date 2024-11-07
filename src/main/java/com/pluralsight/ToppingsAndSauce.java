package com.pluralsight;

import java.util.Scanner;

public class ToppingsAndSauce {
    private String toppings;
    private String sauce;

    Scanner scanner = new Scanner(System.in);
    public String getToppings() {
        System.out.println("Please Choose Your Toppings " + "\n" +
                "1) Meat" + "\n" +
                "2) Cheese" + "\n" +
                "3) Veggies");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Would You Like To Add Meat? (Y/N) ");
                String wantsMeat = scanner.nextLine();
                if (wantsMeat.equalsIgnoreCase("Y")) {
                    getMeat();
                } 
                    break;
                }

        }
        return null;
    }
    public Meat getMeat(){
        return getMeat().selectMeat();
    }
}
