/*
Write a program that prompts the user to enter a hexadecimal number 
, then converts it into a decimal number and print it out;
Below is a sample run:
Enter a hex number: 4D2
The decimal number is: 1234
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hexString = input.nextLine();
        int decimalNumber = 0;
        int base = 1;
        for (int i = hexString.length()-1; i >=0; i--){
            char hexDigit = hexString.charAt(i);
            int hexDigitValue = 0;
            if (hexDigit >= '0' && hexDigit <= '9')
                hexDigitValue = (int)(hexDigit - '0');
            else
                hexDigitValue = (int)(hexDigit - 'A' + 10);
            decimalNumber += hexDigitValue * base;
            base *= 16;
        }
        System.out.printf("The decimal number is: %d\n", decimalNumber);
    }
}
