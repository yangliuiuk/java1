/*
Write a program that prompts the user to enter a binary number, 
then converts it to a decimal number and prints it out. 
Below is a sample run:
Enter a binary number: 101
The decimal number is: 5
*/

import java.util.Scanner;
public class Bin2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.nextLine();
        int decimalNumber = 0;
        int base = 1;
        for (int i = binaryNumber.length() - 1; i >= 0; i--){
            if (binaryNumber.charAt(i) == '1')
                decimalNumber += base;
            base *= 2;
        }
        System.out.printf("The decimal number is: %d\n", decimalNumber);
    }
}
