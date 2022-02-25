/*
Write a program to display all the leap years and the total number of leap years from 1900 to 2023.
You are required to implement a method isLeapYear(int year) that returns a boolean value 
indicating whether a given year is leap year.
A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
Below is a sample run:
1904 1908 1912 1916 1920 1924 1928 1932 1936 1940 1944 1948 1952 1956 1960 1964 1968 1972 1976 1980 
1984 1988 1992 1996 2000 2004 2008 2012 2016 2020
There are 30 leap years between 1900 and 2023.
*/

public class LeapYear2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int year = 1900; year < 2023; year ++){
            if (isLeapYear(year)){
                System.out.print(year + " ");
                counter ++;
            }
        }
        System.out.println("\nThere are " + counter + " leap years between 1900 and 2023.");
    }

    public static boolean isLeapYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }
}
