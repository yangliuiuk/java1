/* Moving Average
Write a program that prompts the user to enter an array of 10 integers, 
and then displays the moving average of this number series. 
Below is the formula to calculate moving average:
MA(i) = Sum(number[0] + number[1] + ... + number[i-1]) / (i + 1)
Below is a sample run:

Enter 10 integers: 
1 2 3 4 5 6 7 8 9 10
Moving averages: 
1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0 5.5

*/

import java.util.Scanner;
public class MovingAvg {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 integers: ");
		for (int i=0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		double[] movingAverages = new double[numbers.length];
		int sum = 0;
		for (int i=0; i < numbers.length; i++){
			sum += numbers[i];
			movingAverages[i] = (double) sum / (i+1);
		}
		System.out.println("Moving averages: ");
		for (int i=0; i < movingAverages.length; i++){
			System.out.print(movingAverages[i] + " ");
		}
	}
}
