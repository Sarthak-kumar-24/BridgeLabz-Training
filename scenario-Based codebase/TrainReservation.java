import   java.util.Scanner;
/*

12. Train Reservation Queue 
Simulate a basic ticket booking system.
 Show menu with switch
 Allow multiple bookings using while-loop.
 Stop booking once seats reach zero (break)
*/

public class TrainReservation{

   public  static void main( String[] args){
       Scanner sc = new Scanner(System.in);
       int availableSeats = 55; 
       boolean isRunning = true; 

       System.out.println(" Welcome to Indian Railways Ticket Booking ");

       while (isRunning) {

           if (availableSeats == 0) {

               System.out.println(" All seats are booked. Booking closed!");
               break;
           }

           System.out.println("\n-------------- Booking Menu ----------------");
           System.out.println("1. Book Ticket");
           System.out.println("2. Check Available Seats");
           System.out.println("3. Exit");
           System.out.print("Enter your choice: ");


           int choice = sc.nextInt();

           switch (choice) {

               case 1:
                      System.out.println("\n----------- booking Starts --------------");
                     System.out.print("Enter number of seats to book: ");
                     int seatsRequested = sc.nextInt();
                      System.out.println("\n----------- booking Processing--------------");

                    

                     // Validates seat request
                     if (seatsRequested <= 0) {
                         System.out.println(" Invalid number of seats!");
                     }

                     else if (seatsRequested <= availableSeats) {

                         availableSeats -= seatsRequested;
                         System.out.println(" Booking successful!");
                         System.out.println(" Seats booked: " + seatsRequested);
                         System.out.println(" Seats remaining: " + availableSeats);
                     }
                     else {
                         System.out.println(" Not enough seats available!");
                     }
                     break;

               case 2:
                     System.out.println(" Available seats: " + availableSeats);
                     break;

               case 3:
                     System.out.println(" Thank you for using the booking system!");
                     isRunning = false;
                     break;

               default:
                     System.out.println(" Invalid choice! Please select 1, 2, or 3.");
           }
       }
       sc.close();

   }
}
