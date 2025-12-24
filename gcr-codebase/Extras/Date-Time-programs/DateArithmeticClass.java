import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Class Name: DateArithmeticClass
 * Description:
 * Performs date arithmetic using LocalDate.
 * Adds days, months, years, and subtracts weeks from a given date.
 */

public class DateArithmeticClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Date formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Taking date input
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Converts String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Adds 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtracts 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Displays results
        System.out.println("Original Date : " + date.format(formatter));
        System.out.println("After Additions : " + updatedDate.format(formatter));
        System.out.println("Final Date (after subtracting 3 weeks): " + finalDate.format(formatter));

        sc.close();
    }
}
