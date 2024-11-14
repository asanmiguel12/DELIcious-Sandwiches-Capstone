package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Bread {
    private String breadSize;
    private String breadType;

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    Scanner scanner1 = new Scanner(System.in);
    public String getBreadSize() {
        System.out.println("~SANDWICH~" + "\n" +
                "What size sandwich would you like" + "\n" +
                "1) 4 Inches" + "\n" +
                "2) 8 Inches" + "\n" +
                "3) 12 Inches");

        int choice = scanner1.nextInt();
        double price = 0;
        String size1 = "4 Inches";
        String size2 = "8 Inches";
        String size3 = "12 Inches";

        switch (choice) {
            case 1:
                price = 5.50;
                this.breadSize = size1;
                return "Sandwich Size: 4 Inches " + "Price: $" + price;
            case 2:
                price = 7.00;
                this.breadSize = size2;
                return "Sandwich Size: 8 Inches " + "Price: $" + price;
            case 3:
                price = 8.50;
                this.breadSize = size3;
                return "Sandwich Size: 12 Inches " + "Price: $" + price;
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
        System.out.println("Please Enter The Type Of Bread You Want:" + "\n" +
                "\"White\", \"Wheat\", \"Rye\", \"Wrap\"");

        String breadChoice = scanner2.nextLine();

        for (String breadName : breads) {
            if (breadChoice.equalsIgnoreCase(breadName)) {
                System.out.println("Bread: " + breadChoice);
                return "Bread Type: " + breadName;
            }
        }
        return null;
    }
}
