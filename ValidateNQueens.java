/* Validate N Queens
Write a program that prompts the user to enter an 8 by 8 chess board where
each grid is either 0 or 1. An one means a queen in that grid. A zero means
the otherwise.  Then, the program should display whether all the queens are
safe. A queen is safe if there is no other queen in the same row, same column
, and same diagonal line.
Below is a sample run:

Enter a board:
0 0 0 1 0 0 0 0
0 0 0 0 0 0 1 0
0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 1
0 1 0 0 0 0 0 0
0 0 0 0 1 0 0 0
1 0 0 0 0 0 0 0
0 0 0 0 0 1 0 0
Safe
*/

import java.util.Scanner;

public class ValidateNQueens {

    public static void main(String[] args){
        // Read a board
        int[][] board = readBoard();
        //displayBoard(board);
        System.out.println(AreQueensSafe(board) ? "Safe" : "Unsafe");
    }

    /** Read a board from the console */
    public static int[][] readBoard(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a board:");
        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i ++)
            for (int j = 0; j < 8; j ++)
                 board[i][j] = input.nextInt();
        return board;
    }

    /** Display a board */
    public static void displayBoard(int[][] board) {
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j ++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Check whether all the queens in the board are safe */
    public static boolean AreQueensSafe(int [][] board) {
        for (int i = 0; i < 8; i ++) 
            for (int j = 0; j < 8; j ++)
                if (board[i][j] == 1 && !isQueenSafe(i, j, board)){
                    return false;
                }
        return true;
    }

    /** Check whether a queen in board[row][col] is safe */
    public static boolean isQueenSafe(int row, int col, int[][] board){

        // Check whether there is another queen in the same row
        for (int j = 0; j < 8; j ++){
            if (board[row][j] == 1 && j != col)
                return false;
        }

        // Check whether there is another queen in the same column
        for (int i = 0; i < 8; i ++){
            if (board[i][col] == 1 && i != row)
                return false;
        }

        // Check whether there is another queen in the upper-left diagonal line
        for (int i = row, j = col; i >= 0 && j >= 0; i --, j-- ) {
            if (board[i][j] == 1 && !(i == row && j == col)){
                return false;
            }
        }

        // Check whether there is another queen in the upper-right diagonal line
        for (int i = row, j = col; i >= 0 && j <= 7; i --, j++ ) {
            if (board[i][j] == 1 && !(i == row && j == col)){
                return false;
            }
        }

        // Check whether there is another queen in the lower-left diagonal line
        for (int i = row, j = col; i <= 7 && j >= 0; i ++, j-- ) {
            if (board[i][j] == 1 && !(i == row && j == col)){
                return false;
            }
        }

        // Check whether there is another queen in the lower-right diagonal line
        for (int i = row, j = col; i <=7  && j <= 7; i ++, j++ ) {
            if (board[i][j] == 1 && !(i == row && j == col)){
                return false;
            }
        }

        return true;

    } 


}
