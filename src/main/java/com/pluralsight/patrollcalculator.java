package com.pluralsight;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class patrollcalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is you name: ");
        String name = myScanner.nextLine();
        System.out.println("Well " + name + " is an unfortuante name.");
        System.out.println("How many hours do you work a week? ");
        float hworked = myScanner.nextFloat();
        //System.out.println("Yikes " + hworked + " you make no money");
        System.out.printf("Yikes %.2f you make no money", hworked);
        System.out.println(", whats your hourly pay?");
        float paid = myScanner.nextFloat();
        System.out.println(paid + "$ Wow, thats even worse");
        //float total = hworked * paid;
        //System.out.println("You make " + total + "$ a week, just give up");
        //%s =String %f = float/double
        //System.out.printf("Well, %s You make $%.2f a week, just give up", name, total);
        float overtimeHours = Math.max(0, hworked - 40);
        float total = (hworked * paid) + (overtimeHours * paid * 0.5f);
        System.out.printf("Well, %s You make $%.2f a week, just give up", name, total);



        double price = 25.00;
        int age = 17;
        if (age < 18) {
            price = price * 0.9;

        }
        System.out.println();
        System.out.println("Price of entry" + price);
        System.out.println();

        //if / else
        if (age >= 21) {
            System.out.println("enter");
        } else {
            System.out.println("no");

        }
        System.out.println();

        //if else
        if (age >= 21) {
            System.out.println("You are allowed to drink!");
        } else {
            System.out.println("You are not allowed to drink!");
        }
        System.out.println();


        //if else
        System.out.println("========== if / else if / else ==========");
        double ticketPrice;

        if (age < 18) {
            ticketPrice = 22.50;
        } else if (age < 65) {
            ticketPrice = 30.50;
        } else {
            ticketPrice = 25.00;
        }

        System.out.println("Ticket price: " + ticketPrice);
        System.out.println();

        //Condition
        // Conditional operator
        System.out.println("========== Conditional operator ==========");

/*
double entryPrice;

if (age < 18) {
    entryPrice = 22.50;
} else {
    entryPrice = 25.00;
}
*/

        double entryPrice = (age < 18) ? 22.50 : 25.00;// temp opertors, conditinal operator

        System.out.println("Entry price: " + entryPrice);
        //
        // True || True => True
// True || False => True
// False || True => True
// False || False => False

// True && True => True
// True && False => False
// False && True => False
// False && False => False

        if (!(age < 18)) {
            System.out.println("Adult");
        }

// Comparing Strings
        System.out.println("========== Comparing Strings ==========");

        if (name.equalsIgnoreCase("Raymond")) {
            System.out.println("I love potatoes!");
        } else {
            System.out.println("I don't love potatoes!");
        }

/*
String letters = "Raymond";
String letters2 = new String("ABC");

if (letters.equals(letters2)) {
    System.out.println("It passed!");
}
*/






    }
}
