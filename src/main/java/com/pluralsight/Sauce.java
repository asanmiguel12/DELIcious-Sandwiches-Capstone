package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Sauce {
    public Sauce() {
    }
        private String name;
        static List<String> sauces1 = List.of("Mayo", "Mustard", "Ranch", "Ketchup",
                "Thousand Island", "Vinaigrette" );

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sauce(String name) {
            this.name = name;
        }


    Scanner scanner = new Scanner(System.in);
    public String getSauce() {
        System.out.println("Please Enter The Type Of Sauce You Want:" + "\n" +
                "\"Mayo\", \"Mustard\", \"Ranch\", \"Ketchup\", \"Thousand Island\", \"Vinaigrette\"");

        String sauceChoice = scanner.nextLine();
        int sauceCount = 0;

        for (String sauceName : Sauce.sauces1) {
            if (sauceChoice.equalsIgnoreCase(sauceName)) {
                sauceCount++;
                System.out.println("Sauce: " + sauceChoice +  " " + "x" + sauceCount);
                return "Sauce: " + sauceChoice +  " " + "x" + sauceCount;
            }
        }
        return null;
    }
}
