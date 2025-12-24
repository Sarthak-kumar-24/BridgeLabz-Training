import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Class Name: DateComparisonClass
 * Compares two dates to check whether the first date
 * is before, after, or equal to the second date.
 */

public class DateComparisonClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Date formatter for input
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Taking first date input
        System.out.print("Enter first date (dd-MM-yyyy): ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);

        // Taking second date input
        System.out.print("Enter second date (dd-MM-yyyy): ");
        String secondInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        // Comparing dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is BEFORE the second date.");
        } 
        else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is AFTER the second date.");
        } 
        else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the SAME.");
        }

        sc.close();
    }
}
