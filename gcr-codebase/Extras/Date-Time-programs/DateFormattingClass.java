import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Class Name: DateFormattingClass
 * Displays the current date in multiple formats
 * using DateTimeFormatter.
 */

public class DateFormattingClass {

    public static void main(String[] args) {

        // Gets current date
        LocalDate today = LocalDate.now();

        // Defines different format patterns
        DateTimeFormatter format1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display formatted dates
        System.out.println("Format 1 (dd/MM/yyyy) : " + today.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd) : " + today.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy) : " + today.format(format3));
    }
}
