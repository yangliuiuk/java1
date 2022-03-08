/*
A palindromic prime is a prime number and also palindromic, for example
131, 313, and 757. Write a program to display the first 50 palindromic 
prime numbers, 10 per line. 

Below is an example output:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
10301 10501 10601 11311 11411 12421 12721 12821 13331 13831
13931 14341 14741 15451 15551 16061 16361 16561 16661 17471
17971 18181 18481 19391 19891 19991 30103 30203 30403 30703

Hint: You can implement a method boolean isPrime(int number)
to check whether a number is a prime number, and a method 
boolean isPalindrome(int number) to check whether a number is 
palindromic, and then call those two methods in the main method.

*/

public class PalindromicPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 50; number ++){
            if (isPrime(number) && isPalindrome(number)){
                System.out.print(number + " ");
                count ++;
                if (count % 10 == 0){
                    System.out.println();
                }
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

    public static int getReversal(int number){
        int number_reversed = 0;
        while (number != 0){
            number_reversed = number_reversed * 10 + number % 10;
            number /= 10;
        }
        return number_reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == getReversal(number);
    }
}
