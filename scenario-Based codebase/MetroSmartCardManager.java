import java.util.Scanner;

/**
 * MetroSmartCardManager
 *
 * Simulates a Delhi Metro smart card system where:
 * 1) User enters travel distance
 * 2) Fare is calculated using ternary operator
 * 3) Fare is deducted from smart card balance
 * 4) Loop continues until balance is exhausted or user quits
 */
public class MetroSmartCardManager {

    // Exit code to stop using the metro system
    private static final int EXIT_CODE = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initial smart card balance
        int balance = 100;

        System.out.println(" Welcome to Delhi Metro Smart Card System");
        System.out.println("Initial Balance: ₹" + balance);
        System.out.println("Enter -1 to exit.\n");

        while (balance > 0) {

            //  Take distance input
            System.out.print("Enter distance traveled (in km): ");
            int distance = scanner.nextInt();

            // Exit condition
            if (distance == EXIT_CODE) {
                System.out.println("\n User exited the system.");
                break;
            }

            if (distance <= 0) {
                System.out.println(" Invalid distance. Please enter a positive value.\n");
                continue;
            }

            //  Calculate fare using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            // Check balance and deduct fare
            if (balance >= fare) {
                balance -= fare;
                System.out.println(" Fare ₹" + fare + " deducted successfully.");
                System.out.println(" Remaining Balance: ₹" + balance + "\n");
            } else {
                System.out.println(" Insufficient balance.");
                System.out.println(" Remaining Balance: ₹" + balance);
                System.out.println(" Please recharge your smart card.\n");
                break;
            }
        }

        if (balance == 0) {
            System.out.println(" Smart card balance exhausted.");
        }

        scanner.close();
        System.out.println(" Thank you for using Delhi Metro!");
    }
}
