/*
Write a program that prompts the user to enter 10 real numbers and displays the standard deviation of them. 
You can use Math.pow() and Math.sqrt() to compute the power and the square root of a number. 
*/

import java.util.Scanner;
public class StandardDeviation {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        double mean = sum / numbers.length;

        double squareSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            squareSum += Math.pow(numbers[i] - mean, 2);
        }

        double standardDeviation = Math.sqrt(squareSum / (numbers.length - 1));
        System.out.println("The standard deviation is " + standardDeviation);

    }
}