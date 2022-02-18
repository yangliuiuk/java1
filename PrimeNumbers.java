/*
Write a program to display the first 50 prime numbers. 
An integer greater than 1 is prime if its only positive divisor is 1 or itself. 
*/

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 50; number ++){
            boolean isPrime = true;
            for (int divisor = 1; divisor <= number; divisor ++ ){
                if (number % divisor == 0 && divisor != 1 && divisor != number){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + " ");
                count ++;
            }
        }
    }
}
