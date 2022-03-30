/* Write a program that reads 9 integers from the user input, then 
store them into a 3-by-3 two-dimensional array, next calculate the 
sum of every row, every column, and the entire array. 
*/

import java.util.Scanner;
public class Sum2dArray {
    public static void main (String[] args){
        int ARRAY_LENGTH = 3;
        int[][] matrix = new int[ARRAY_LENGTH][ARRAY_LENGTH];
        int[] total_row = new int[ARRAY_LENGTH];
        int[] total_col = new int[ARRAY_LENGTH];
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 rows and 3 columns: ");
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j ++){
                matrix[i][j] = input.nextInt();
                total_row[i] += matrix[i][j];
                total_col[j] += matrix[i][j];
                total += matrix[i][j];
            }
        }

        System.out.print("Sum by row: ");
        for (int i = 0; i < ARRAY_LENGTH; i ++){
            System.out.print(total_row[i] + " ");
        }
        System.out.print("\nSum by column: ");
        for (int i = 0; i < ARRAY_LENGTH; i ++){
            System.out.print(total_col[i] + " ");
        }
        System.out.print("\nSum of all elements: " + total);

    }
}
