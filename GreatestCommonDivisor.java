/*
Find the greatest common divisor
Write a program that prompts the user to enter two positive integers and finds their greatest common divisor. 

The greatest common divisor (GCD) of two integers, which are not all zero, is the largest positive integer 
that divides each of the integers. For example, the greatest common divisor of 16 and 24 is 8.
*/

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k ++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
        
        // Another approach
        for (int i = n1 < n2 ? n1: n2; i > 0; i --){
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + i);
                break;
    }
}
