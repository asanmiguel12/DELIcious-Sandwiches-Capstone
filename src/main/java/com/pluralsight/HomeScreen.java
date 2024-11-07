package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome To DELIcious Sandwiches" + "\n" +
                "What Would You Like To Do Today?" +
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
                System.out.println("Please Input A Correct Choice");

        }

    }

    public static void exit(){
        System.out.println("We'll Always Be Here Whenever You Get Hungry");
    }
}
