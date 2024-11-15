package com.pluralsight.Sandwich;

import com.pluralsight.Order;

import javax.xml.transform.Source;
import java.util.Scanner;

import static com.pluralsight.Sandwich.Sandwich.*;

public class SignatureSandwich {

    Scanner scanner = new Scanner(System.in);
    public void signatureSandwichPrompt() {
        System.out.println("Would You Like To Add Our DELIcious Signature Sandwich? (Y/N)");

        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")){
            BLT();
        } if (choice.equalsIgnoreCase("N")) {
            Sandwich sandwich = new Sandwich();
            sandwich.getSandwich();
        }
    }

    public void BLT() {
        breadTypeAndSize.add("Sandwich Size: 8 Inches Price: $5.5");
        breadTypeAndSize.add("Bread Type: White");
        breadTypeAndSize.add("Toasted");

        premiumToppings.add("Meat: Bacon x1 Price: $1.0");
        premiumToppings.add("Cheese: Cheddar x1");

        regularToppings.add("Veggies: Lettuce x1");
        regularToppings.add("Veggies: Tomato x1");
        regularToppings.add("Sauce: Ranch x1");

        System.out.println("Added DELIcious BLT x1 To Cart");
        Order order = new Order();
        order.orderMenu();

    }
}
