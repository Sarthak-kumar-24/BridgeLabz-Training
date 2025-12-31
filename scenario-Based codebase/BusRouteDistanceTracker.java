import java.util.Scanner;

/*
19. Bus Route Distance Tracker 
Each stop adds distance.
 Ask if the passenger wants to get off at a stop.
 Use a while-loop with a total distance tracker.
 Exit on user confirmation.
*/
public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;

        while (true) {

            System.out.print("Enter distance covered at stop " + stopNumber + " (in km): ");
            int distance = sc.nextInt();

            totalDistance += distance;

            System.out.println("Total distance so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("yes")) {
                System.out.println("\n Passenger got off.");
                System.out.println(" Final distance traveled: " + totalDistance + " km");
                break;
            }

            stopNumber++;
        }

        sc.close();
    }
}
