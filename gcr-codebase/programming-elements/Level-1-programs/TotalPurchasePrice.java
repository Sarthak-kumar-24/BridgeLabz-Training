import java.util.Scanner;

//Creating a class named  TotalPurchasePrice that  Calculates the total purchase price  based on unit price and quantity.
 


public class TotalPurchasePrice {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take unit price from user
        double unitPrice = input.nextDouble();

        // Take quantity from user
        int quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice  *  quantity;

        // Display output
        System.out.println(
                "The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice
        );

        // Close scanner resource
        input.close();
    }
}
