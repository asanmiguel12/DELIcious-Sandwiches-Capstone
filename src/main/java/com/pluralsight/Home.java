package com.pluralsight;

import java.util.Scanner;

public class Home {

    static Scanner scanner = new Scanner(System.in);
    public static void homeMenu() {

        System.out.println("\n\n~Welcome To DELIcious Sandwiches~" + "\n\n" +
                "How Can We Help You Today?" + "\n" +
                "1) Place A New Order " + "\n" +
                "2) Exit" );
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Order order = new Order();
                order.orderMenu();
                break;
            case 2:
                exit();
                break;
            default:
                System.out.println("Invalid Input Please Try Again");
                homeMenu();

        }
    }

    public static void exit(){
        System.out.println("We'll Always Be Here Whenever You Get Hungry" + "\n" +
                "Come Back Again Soon!");
    }
}
