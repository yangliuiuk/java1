/*
Write a program that prompts the user to enter a string, and then
display the string in uppercase. 
For example, if a user enters "abC", then the program should display "ABC". 
You cannot simply use the toUpperCase() method in Java. 
*/

import java.util.Scanner;
public class ToUpperCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                s1 += (char)(s.charAt(i) - 'a' + 'A');
            }
            else 
                s1 += s.charAt(i);
        }
        System.out.print("New string is: " + s1);
    }
}
