/*
Lintcode 1141
Write a program that prompts the user to enter a year (0-2200) and a month (1-12),
then displays the number of days in that month.
*/

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        System.out.printf("There are %d days in this month.", getTheMonthDays(year, month));
    }

    public static int getTheMonthDays(int year, int month){
        if (month == 2){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                return 29;
            else 
                return 28;
        }
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12: return 31;
            case 4, 6, 9, 11: return 30;
        }
        return 0;
    }

}
