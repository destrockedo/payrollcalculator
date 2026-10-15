package com.pluralsight;

import java.util.Scanner;
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




    }
}
