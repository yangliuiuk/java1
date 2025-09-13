/*
Write a Java program that takes a year as input from the user and checks whether it is a
leap year or not.
    */

import java.util.Scanner;

public class LeapYearCheckerBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        // Rule: divisible by 4
        if (year % 4 == 0) {
            // Century years: must also be divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        // Print result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}

