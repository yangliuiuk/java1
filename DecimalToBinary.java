/*
Write a program that reads a decimal number from user, 
then converts it to a binary number and displays it. 
Below is a sample run:
Enter a decimal number: 5
The binary number is: 101
*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        String binaryString = "";
        do {
            binaryString = String.valueOf(decimalNumber % 2) + binaryString;
            decimalNumber /= 2;
        } while(decimalNumber > 0);
        System.out.printf("The binary number is: %s\n", binaryString);
    }
}
