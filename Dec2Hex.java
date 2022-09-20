/*
Write a program that prompts the user to enter a decimal number,
then convert it into a hexadecimal number and print it out.
*/

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        String hexNumber = "";
        do 
        {
            int hexDigitValue = decimalNumber % 16;
            char hexDigit = ' ';
            if (hexDigitValue >= 0 && hexDigitValue <= 9)
                hexDigit = (char)(hexDigitValue + '0');
            else
                hexDigit = (char)(hexDigitValue - 10 + 'A');
            hexNumber = hexDigit + hexNumber;
            decimalNumber /= 16;
        } while(decimalNumber > 0) ;
        
        System.out.printf("The hex number is %s\n", hexNumber);
    }
}
