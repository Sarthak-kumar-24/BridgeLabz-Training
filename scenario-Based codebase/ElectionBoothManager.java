import java.util.Scanner;

/**
 * ElectionBoothManager
 *
 * Simulates a polling booth system where voters:
 * 1) Enter their age
 * 2) Are checked for eligibility (>= 18)
 * 3) Cast a vote for a candidate (1, 2, or 3)
 * 4) Multiple voters are handled in a loop
 * 5) Program exits on a special exit code
 */
public class ElectionBoothManager {

    // Exit code to stop the polling process
    private static final int EXIT_CODE = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the Election Booth System");
        System.out.println("Enter -1 at any point to exit.\n");

        while (true) {

            //  Take age input
            System.out.print("Enter voter age: ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == EXIT_CODE) {
                System.out.println("\n Polling booth closed. Thank you!");
                break;
            }

            // Check eligibility
            if (age < 18) {
                System.out.println(" Not eligible to vote (Age must be 18 or above).\n");
                continue;
            }

            // Record vote
            System.out.println("Eligible to vote ");
            System.out.println("Cast your vote:");
            System.out.println("1 → Candidate A");
            System.out.println("2 → Candidate B");
            System.out.println("3 → Candidate C");
            System.out.print("Enter your choice: ");

            int vote = scanner.nextInt();

            // Exit condition
            if (vote == EXIT_CODE) {
                System.out.println("\n Polling booth closed. Thank you!");
                break;
            }

            // Validate vote
            if (vote == 1 || vote == 2 || vote == 3) {
                System.out.println(" Vote recorded successfully.\n");
            } else {
                System.out.println(" Invalid vote. Please choose 1, 2, or 3.\n");
            }
        }

        scanner.close();
    }
}
