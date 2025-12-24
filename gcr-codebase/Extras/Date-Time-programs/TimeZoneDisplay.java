import java.time.zoneId;
import java.time.ZoneDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class Name: TimeZoneDisplay
 * Displays the current date and time in different time zones
 * using ZonedDateTime and ZoneId.
 */

public class TimeZoneDisplay{
   public static void main( String[] args){

       // Formatter for readable output
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

      // GMT Time
       ZonedDateTime    gmtTime = ZonedDateTime.now(zoneId.of("GMT"));

       // IST Time (India)
       ZonedDateTime   isTime = ZonedDateTime.now(zoneId.of("Asia/Kolkata"));

       // PST Time (Pacific Standard Time)
       ZonedDateTime    pstTime = ZonedDateTime.now(zoneId.of("America/Los_Angeles"));


       // Displaying the results
        System.out.println("Current Time in GMT : " + gmtTime.format(formatter));
        System.out.println("Current Time in IST : " + istTime.format(formatter));
        System.out.println("Current Time in PST : " + pstTime.format(formatter));
    }
}


