/*
Write a program to let the user to enter the height of a triangle, 
then display four triangle patterns below. 

Enter triangle height: 5
The bottom-left pattern:
*
**
***
****
*****
The upper-left pattern:
*****
****
***
**
*
The upper-right pattern:
*****
 ****
  ***
   **
    *
The bottom-right pattern:
    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;
public class TrianglePatterns {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter triangle height: ");
        int height = input.nextInt();

        //Display the bottom-left pattern
        System.out.println("The bottom-left pattern:");
        for (int r = 1; r <= height; r ++) {
            for (int c = 1; c <= r; c ++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Display the upper-left pattern
        System.out.println("The upper-left pattern:");
        for (int r = 1; r <= height; r ++) {
            for (int c = 1; c <= height-r+1; c ++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Display the upper-right pattern
        System.out.println("The upper-right pattern:");
        for (int r = 1; r <= height; r ++) {
            for (int c = 1; c <= height; c ++){
                if (c < r)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        //Display the upper-right pattern
        System.out.println("The bottom-right pattern:");
        for (int r = 1; r <= height; r ++) {
            for (int c = 1; c <= height; c ++){
                if (c <= height - r)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}