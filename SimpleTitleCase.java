/*
Write a program that prompts the user to enter a sentence (in 100 words),
then displays the sentence in the simple title case, i.e., the first letter of each word is capitalized (in uppercase).
For example, if the user enters "java is fun", then the program should display "Java Is Fun"
*/

import java.util.Scanner;

public class SimpleTitleCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = input.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i ++){
            if (i == 0 || (s.charAt(i-1) == ' '))
                s1 += toUpperCase(s.charAt(i));
            else
                s1 += s.charAt(i);
        }
        System.out.println("The sentence in title case is: " + s1);
    }

    public static char toUpperCase(char c){
        if (c >= 'a' && c <= 'z')
            return (char)(c - 'a' + 'A');
        else
            return c;
    }
}
