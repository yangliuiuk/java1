/*
Alphabetical sudoku solution validation
Write a program that prompts the user to enter a solution of an alphabetical sudoku and reports whether it is valid.
A solution is valid if:
1) Each grid must contain a character from 'A' to 'I',
2) There are no duplicates in each row, each column, and each 3 by 3 box.

Below is a sample run:

Enter a Sudoku puzzle solution:
I F C A G D B E H
A G H C B E F D I
B E D F H I G C A
H B A D C G E I F
D I F H E B C A G
G C E I F A H B D
E H I G A C D F B
C A G B D F I H E
F D B E I H A G C
Valid solution

*/

import java.util.Scanner;

public class ValidateAlphabeticalSudoku {

    public static void main(String[] args) {
        // Read a Sudoku solution
        char[][] grid = readSolution();
        // displaySolution(grid);
        System.out.println(isValidSolution(grid) ? "Valid solution" : "Invalid solution");
    }

    /** Read a Sudoku solution from the console */
    public static char[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        char[][] grid = new char[9][9];
        for (int i = 0; i < 9; i ++) 
            for (int j = 0; j < 9; j ++){
                grid[i][j] = input.next().charAt(0);
            }
        return grid;

    }

    /** Display a Sudoku solution */
    public static void displaySolution(char[][] grid) {
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Check whether a solution is valid */
    public static boolean isValidSolution(char[][] grid ) {
        for (int i = 0; i < 9; i ++) 
            for (int j = 0; j < 9; j ++)
                if (grid[i][j] < 'A' || grid[i][j] > 'I' || !isValidGrid(i, j, grid)){
                    return false;
                }
        return true;
    }

    /** Check whether grid[i][j] is valid in the grid */
    public static boolean isValidGrid(int i, int j, char[][] grid){
        // Check whether grid[i][j] is unique in the i'th row
        for (int c = 0; c < 9; c ++)
            if (grid[i][c] == grid[i][j] && c != j )
                return false;
        // Check whether grid[i][j] is unique in the j'th column
        for (int r = 0; r < 9; r ++)
            if (grid[r][j] == grid[i][j] && r != i )
                return false;

        // Check whether grid[i][j] is unique in the 3X3 box
        int box_r_start = (i / 3) * 3;
        int box_c_start = (j / 3) * 3;
        for (int r = box_r_start; r < box_r_start + 3; r ++)
            for (int c = box_c_start; c < box_c_start + 3; c ++)
                if (grid[r][c] == grid[i][j] && !(r == i && c == j))
                    return false;

        return true;
    }
}
