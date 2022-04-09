/* Write a program that prompts the user to enter an array of integers, then randomly shuffles the array
and displays the shuffled array.

Below is a sample run:

Enter array size: 5
Enter an array: 1 2 3 4 5
The shuffled array: 5 3 4 2 1

Hint:
Fisher-Yates algorithm can be used to shuffle an array. 
1) Set the current index to 0.
2) Randomly choose an index between the current index and the last index of the array.
3) Swap the elements at the current index and the chosen index.
4) Increment the current index by 1.
5) Go to step 2 if the current index <= the last index of the array.
*/
import java.util.Scanner;
public class ShuffleArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int ARRAY_SIZE = input.nextInt();
        int[] array = new int[ARRAY_SIZE];
        System.out.print("Enter an array: ");
        for (int i = 0; i < array.length; i ++)
            array[i] = input.nextInt();
        shuffle(array);
        System.out.print("The shuffled array: ");
        printArray(array);
    }
    
    // swap the element at index i and the element at index j in the array
    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // generate a random integer between min and max, excluding max
    public static int randRange(int min, int max){
        return (int) ( Math.random() * (max - min) ) + min;
    }
    
    // randomly shuffle an array
    public static void shuffle(int[] array){
        for (int i = 0; i < array.length; i ++){
            int j = randRange(i, array.length);
            swap(i, j, array);
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i ++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
