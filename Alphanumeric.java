/*
Lintcode 23
Write a method to check whether a given character (char) is alphanumeric.
If the character is either a number or a letter, the method should return true. Otherwise, return false.
Test this method by reading a user input and then displaying its return value.
*/

import java.util.Scanner;

public class Alphanumeric {
    /**
     * @param c: A character.
     * @return: The character is alphanumeric or not.
     */
    public static boolean isAlphanumeric(char c) {
        // write your code here
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')|| (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char c = input.nextLine().charAt(0);
        System.out.println(isAlphanumeric(c));
    }

}
