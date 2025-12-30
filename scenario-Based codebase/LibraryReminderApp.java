import java.util.Scanner;

/*
 Rohan’s Library Reminder App 
Rohan wants a fine calculator:
 Input return date and due date.
 If returned late, calculate fine: ₹5/day.
 Repeat for 5 books using for-loop.


*/

public class LibraryReminderApp {

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       int totalFine = 0;

       for( int bookNumber =1 ;bookNumber <=5; bookNumber++){


           System.out.println("\n Book " + bookNumber);

           System.out.println("Enter due date(day number): ");
           int dueDate = sc.nextInt();


           System.out.println("Enter return date(day number): ") ;
           int returnDate = sc.nextInt();

           int lateDays = returnDate - dueDate;
           int fine =0;

           if( lateDays > 0){

               fine = lateDays * 5;
               System.out.println("late by " + lateDays + " days");
               System.out.println(" Fine for this book: Rs" + fine);
           } else {
               System.out.println(" Returned on time. No fine.");
           }
           totalFine += fine;
       }

       // Final summary

       System.out.println("\n ---------------- FINAL SUMMARY -------------------");
       System.out.println("Total Fine Payable: Rs" + totalFine);
       sc.close();
   }
}


