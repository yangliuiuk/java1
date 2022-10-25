import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2000): ");
        int year = input.nextInt();
        System.out.print("Enter the month in number (1-12 for Jan-Dec): ");
        int month = input.nextInt();

        printCalender(month, year);

    }

    public static void printCalender(int month, int year){
        System.out.println(getMonthName(month) + " " + year);
        for (int i = 0; i < 28; i++)
            System.out.print("-");
        System.out.println();
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getDayOfTheWeek(1, month, year);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
        
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int day = 1; day <= numberOfDaysInMonth; day++){
            System.out.printf("%4d", day);

            if ((day + startDay) % 7 == 0)
                System.out.println();

        }
        System.out.println();
    }

    public static int getDayOfTheWeek(int dayOfTheMonth, int month, int year) {
        int q = dayOfTheMonth;
        int m = month;
        if (month == 1 || month == 2) {
            m = month + 12;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;

        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        int dayOfTheWeek;

        if (h == 0)
            dayOfTheWeek = 6;
        else
            dayOfTheWeek = h - 1;

        return dayOfTheWeek;
    }

    public static int getNumberOfDaysInMonth(int month, int year){
        int numberOfDaysInMonth = 0;
        switch(month) {
            case 1,3,5,7,8,10,12 -> numberOfDaysInMonth = 31;
            case 4,6,9,11 -> numberOfDaysInMonth = 30;
            case 2 -> numberOfDaysInMonth = isLeapYear(year) ? 29 : 28;
        }
        return numberOfDaysInMonth;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getMonthName(int month){
        String monthName = "";
        switch(month) {
            case 1 -> monthName = "Jan";
            case 2 -> monthName = "Feb";
            case 3 -> monthName = "Mar";
            case 4 -> monthName = "Apr";
            case 5 -> monthName = "May";
            case 6 -> monthName = "Jun";
            case 7 -> monthName = "Jul";
            case 8 -> monthName = "Aug";
            case 9 -> monthName = "Sep";
            case 10 -> monthName = "Oct";
            case 11 -> monthName = "Nov";
            case 12 -> monthName = "Dec";
        }
        return monthName;
    }

}
