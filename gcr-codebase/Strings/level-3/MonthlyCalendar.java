import java.util.Scanner;

/**
 * Class Name: MonthlyCalendar
 * Description:
 * This program displays the calendar for a given month and year
 * using the Gregorian calendar algorithm.
 */
public class MonthlyCalendar {

    
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month - 1];
    }

        //Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }


    //Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    /* 
       Method to get first day of the month (Gregorian algorithm)
       0 = Sunday, 1 = Monday, ..., 6 = Saturday
    */
    public static int getFirstDay(int month, int year) {

        int d = 1; // day = 1st of month
        int m = month;
        int y = year;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }


    //Method to display calendar
    public static void displayCalendar(int month, int year) {

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // First loop → indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop → print days
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
