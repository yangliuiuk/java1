/*
Write a program that prompts the user to enter three integers in the range of 1 to 10, 
and then display the largest number, the smallest number, and the sum of the three numbers.
*/

import java.util.Scanner;
public class IterateNumbersBasic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int largest = 0;
        // Or the following:
        //int largest = Integer.MIN_VALUE;
        int smallest = 11;
        // Or the following:
        //int smallest = Integer.MAX_VALUE;
        int sum = 0;
        System.out.println("Enter 3 integers: ");
        for (int i = 1; i <= 3; i++){
            int number = input.nextInt();
            if (number > largest)
                largest = number;
            if (number < smallest)
                smallest = number;
            sum += number;
        }
        System.out.println("The largest number is : " + largest);
        System.out.println("The smallest number is : " + smallest);
        System.out.println("The sum of the three numbers is : " + sum);
    }
}
