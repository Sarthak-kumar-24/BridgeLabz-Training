import java.util.Scanner;

//Creating a class named  TotalPurchasePrice that  Calculates the total purchase price  based on unit price and quantity.
 


public class TotalPurchasePrice {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


        // Taking  unit price and quantity from user
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();



        // Calculating total purchase price
        double totalPrice = unitPrice  *  quantity;



        // Displaying the  output
        System.out.println(
                "The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice
        );

      
    }
}
