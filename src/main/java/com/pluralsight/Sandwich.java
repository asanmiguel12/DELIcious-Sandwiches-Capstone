package com.pluralsight;

import java.util.Scanner;

public class Sandwich {
    private String breadSize;
    private String breadType;
    private String toppings;
    private String sauces;

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

        switch (choice) {
            case 1:
                System.out.println("Sandwich Size: 4 Inches");
                getToppingsAndSauce();
                return size1;
            case 2:
                System.out.println("Sandwich Size: 8 Inches");
                return size2;
            case 3:
                System.out.println("Sandwich Size: 8 Inches");
                return size3;
            default:
                System.out.println("You Did Not Select A Size" +
                        "Please Input The Number Of The Size Sandwich You Would Like");
        }
        return null;
    }

    public String getToppingsAndSauce(){
        ToppingsAndSauce toppingsAndSauce = new ToppingsAndSauce();
        return toppingsAndSauce.getToppings();
    }
}
