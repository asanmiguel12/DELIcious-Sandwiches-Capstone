package com.pluralsight.Sandwich;

import java.util.List;
import java.util.Scanner;
import static com.pluralsight.Sandwich.Sandwich.*;

public class Bread {
    private String breadSize;
    private String breadType;
    private double price;

    Scanner scanner1 = new Scanner(System.in);
    public String getBreadSize() {
        System.out.println("~BREAD SIZE~" + "\n" +
                "What Size Bread Would You Like?" + "\n" +
                "1) 4 Inches Price: $5.50" + "\n" +
                "2) 8 Inches Price: $7.00" + "\n" +
                "3) 12 Inches Price: $8.50");

        int choice = scanner1.nextInt();
        double price = 0;
        String size1 = "4 Inches";
        String size2 = "8 Inches";
        String size3 = "12 Inches";

        switch (choice) {
            case 1:
                price = 5.50;
                this.breadSize = size1;
                return "Sandwich Size: " + size1 + " Price: $" + price;
            case 2:
                price = 7.00;
                this.breadSize = size2;
                return "Sandwich Size: " + size2 + " Price: $" + price;
            case 3:
                price = 8.50;
                this.breadSize = size3;
                return "Sandwich Size: " + size3 + " Price: $" + price ;
            default:
                System.out.println("You Did Not Select A Size" +
                        "Please Input The Number Of The Size Sandwich You Would Like");
        }
        scanner1.close();
        return null;
    }

    Scanner scanner2 = new Scanner(System.in);
    public String getBreadType() {
        List<String> breads = List.of("White", "Wheat", "Rye", "Wrap");
        System.out.println("~BREAD TYPE~" + "\n" +
                "Please Enter The Type Of Bread You Want:" + "\n" +
                "\"White\", \"Wheat\", \"Rye\", \"Wrap\"");

        String breadChoice = scanner2.nextLine();

        for (String breadName : breads) {
            if (breadChoice.equalsIgnoreCase(breadName)) {
                System.out.println("Great Choice! Bread: " + breadName);
                return "Bread Type: " + breadName;
            }
        }
        return null;
    }


    public double getPrice() {
        if (breadTypeAndSize.contains("Sandwich Size: 4 Inches Price: $5.5")) {
            return this.price = 5.50;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 8 Inches Price: $7.0")) {
            return this.price = 7.00;
        }
        if (breadTypeAndSize.contains("Sandwich Size: 12 Inches Price: $8.5")) {
            return this.price = 8.50;
        }
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }
}
