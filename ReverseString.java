/*
Reverse a string
Write a program that prompts the user to enter a string and displays the string in reverse order.
For example, the reversed string of "abc" is "cba".
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
    
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        System.out.println("The reversed string is: " + result);
    }
}
