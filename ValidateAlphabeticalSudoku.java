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
        System.out.println("Enter a Sudoku solution: ");
        char[][] board = readBoard(); 
        //printBoard(board);
        if (isValidBoard(board)) {
            System.out.println("Valid solution");
        }
        else {
            System.out.println("Invalid solution");
        }

    }

    /** Read a board from keyboard
     */

    public static char[][] readBoard() {
        char[][] board = new char[9][9];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }
        return board;
    }

    /** Print a board */

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Check whether board[row][col] is valid */
    /** 
     * @param row row number
     * @param col column number
     * @param board board
     * @return wether board[row][col] is valid
    */

    public static boolean isValidGrid(int row, int col, char[][] board) {
        /** check whether board[row][col] is from 'A' to 'I' */
        if (board[row][col] > 'I' || board[row][col] < 'A') {
            return false;
        }
        /** check whether board[row][col] is unique in row (row number) */
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == board[row][col] && j != col) {
                return false;
            }
        }
        /** check whether board[row][col] is unique in column (col number) */
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == board[row][col] && i != row) {
                return false;
            }
        }

        /** check whether board[row][col] is unique in the 3x3 box */
        int boxStartRow = (row / 3) * 3;
        int boxStartCol = (col / 3) * 3;
        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if (board[i][j] == board[row][col] && !(i == row && j == col)) {
                    return false;
                }
            }
        }

        return true;
    }

    /** Check whether board is valid */
    public static boolean isValidBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValidGrid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

}
