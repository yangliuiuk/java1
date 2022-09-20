/*
Write a program that prompts the user to enter a decimal number, 
then converts it to a binary number and displays it. 
Below is a sample run:
Enter a decimal number: 5
The binary number is: 101
*/
import java.util.Scanner;
public class Dec2Bin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        String binaryNumber = "";
        do {
            int binaryDigitValue = decimalNumber % 2;
            char binaryDigit = (char)(binaryDigitValue +'0');
            // String binaryDigit = String.valueOf(binaryDigitValue);
            binaryNumber = binaryDigit + binaryNumber;
            decimalNumber /= 2;
        } while(decimalNumber > 0);
        System.out.printf("The binary number is: %s\n", binaryNumber);
    }
}
