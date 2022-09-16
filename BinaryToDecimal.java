/*
Write a program that lets user to enter a binary number, then converts it to a decimal number and displays it. 
Below is a sample run:
Enter a binary number: 101
The decimal number is: 5
*/

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = input.nextLine();
        int decimalValue = 0;
        int base = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--){
            if (binaryString.charAt(i) == '1')
                decimalValue += base;
            base *= 2;
        }
        System.out.printf("The decimal number is: %d\n", decimalValue);
    }
}
