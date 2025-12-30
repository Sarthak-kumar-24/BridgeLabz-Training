import java.util.Scanner;

/*
14. Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
 Use switch and if together.
 Loop through multiple customers.
 Clean structure and helpful variable names.
*/
public class MovieTicketBookingApp {

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       boolean moreCustomers = true;

       while( moreCustomers){

           int basePrice =0;
           int totalAmount =0;

           //giving options to user
           System.out.println("\n Select  Movie type: ");
           System.out.println("1. Action");
           System.out.println("2. Comedy");
           System.out.println("3. Drama");
           System.out.println("4. Romantic");
           System.out.println("5. Erotic");
           System.out.print("Enter choice: ");

           int movieChoice = sc.nextInt();

           switch( movieChoice ){

               case 1:
                   basePrice = 250;
                   System.out.println("You Selected Action movie");
                   break;

               case 2:
                   basePrice = 150;
                   System.out.println("You selected Comedy movie");
                   break;

               case 3:
                   basePrice = 180;
                   System.out.println("You selected Drama movie");
                   break;

               case 4:
                   basePrice = 200;
                   System.out.println("You selected Romantic movie");
                   break;

               case 5:
                   basePrice = 280;
                   System.out.println("You selected Erotic movie");
                   break;


               default:
                   System.out.println(" Invalid movie choice!");
                   continue;

           }

           totalAmount += basePrice;

           // Seat Selection
           System.out.print("\nSelect Seat Type (Gold/Silver): ");
           String seatType = sc.next();

           if (seatType.equalsIgnoreCase("Gold")) {
               totalAmount += 100;
           } else if (seatType.equalsIgnoreCase("Silver")) {
               totalAmount += 50;
           } else {
               System.out.println(" Invalid seat type!");
               continue;
           }

           System.out.print("\nDo you want snacks? (Yes/No): ");
           String snacksChoice = sc.next();
           if (snacksChoice.equalsIgnoreCase("Yes")) {
               totalAmount += 120;
           }

           //  Final Bill
           System.out.println("\n ------------- BILL SUMMARY ---------------");
           System.out.println("Base Price: Rs" + basePrice);
           System.out.println("Total Amount Payable: Rs" + totalAmount);

           //  Another Customer
           System.out.print("\nServe another customer? (Yes/No): ");
           String choice = sc.next();
           if (!choice.equalsIgnoreCase("Yes")) {
               moreCustomers = false;
           }
       }


       System.out.println("\n Thank you for using Movie Ticket Booking App!");
       sc.close();
   }
}