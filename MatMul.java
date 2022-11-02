import java.util.Scanner;
public class MatMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix A: ");
        int numRowsA = input.nextInt();
        System.out.print("Enter the number of columns of matrix A: ");
        int numColsA = input.nextInt();
        System.out.println("Enter elements of matrix A: ");
        int[][] matrixA = new int[numRowsA][numColsA];
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsA; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the number of rows of matrix B: ");
        int numRowsB = input.nextInt();
        System.out.print("Enter the number of columns of matrix B: ");
        int numColsB = input.nextInt();
        System.out.println("Enter elements of matrix B: ");
        int[][] matrixB = new int[numRowsB][numColsB];
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }

        if (numColsA != numRowsB) {
            System.out.println("The number of rows of the first matrix must equal the number of columns of the second matrix");
            return;
        }

        int[][] matrixC = new int[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                int sum = 0;
                for (int k = 0; k < numColsA; k++) {
                    sum += matrixA[i][k] + matrixB[k][j];
                }
                matrixC[i][j] = sum;
            }
        }

        System.out.println("The matrix product of A and B is: ");
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                System.out.printf("%4d", matrixC[i][j]);
            }
            System.out.println();
        }

    }
}
