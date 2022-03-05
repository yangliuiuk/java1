/*
Write a program that prompts the user to enter a string, and then
display the string in lowercase. 
For example, if a user enters "aBC", then the program should display "abc". 
You cannot simply use the toLowerCase() method in Java. 
*/

import java.util.Scanner;
public class ToLowerCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                s1 += (char)(s.charAt(i) - 'A' + 'a');
            }
            else 
                s1 += s.charAt(i);
        }
        System.out.print("The new string is: " + s1);
    }
}
