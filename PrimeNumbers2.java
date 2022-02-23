/*
Write a program to display the first 50 prime numbers. 
An integer greater than 1 is prime if its only positive divisor is 1 or itself. 
You are required to implement and use a method isPrime(int number) that returns 
a boolean value indicating whether a number is a prime number. 
*/

public class PrimeNumbers2 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 50; number ++){
            if (isPrime(number)){
                System.out.print(number + " ");
                count ++;
            }
        }
    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor ++ ){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
