/*
Write a program that prompts the user to enter a decimal number,
then convert it into a hex number and print it out.
*/

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        String hexString = "";
        do 
        {
            int hexDigitNumber = decimalNumber % 16;
            char hexDigitChar = ' ';
            if (hexDigitNumber >= 0 && hexDigitNumber <= 9)
                hexDigitChar = (char)(hexDigitNumber + '0');
            else
                hexDigitChar = (char)(hexDigitNumber - 10 + 'A');
            hexString = hexDigitChar + hexString;
            decimalNumber /= 16;
        } while(decimalNumber > 0) ;
        
        System.out.println("The hex number is " + hexString);
    }
}
