import java.util.Scanner;



/**
 * Class Name: CoffeeCounter
 * Simulates a coffee counter where customers can order coffee,
 * specify quantity, get total bill including GST,
 * and continue ordering until they type "exit".
 */

public class CoffeeCounter{
   private static final double GST_RATE = 0.05;

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("Welcome to Ravi's Coffee Counter ");

       while(true){

           System.out.print("\n Enter coffee type or 'exit' to stop: ");

           // Exit condition
           if( coffeeType.equals("exit")){

               System.out.println("Thank you for visiting Ravi's Cafe. have a great day! ");
               break;
           }

           double pricePerCup = getCoffeeprice(coffeeType);

           if( pricePerCup == 0){

               System.out.println("Invalid coffee type. Please try again. ");
               continue;
           }

           System.out.print("Enter quantity: ");

           int quantity = sc.nextInt();

           if( quantity <= 0){
               System.out.println("Quantity  must be greater the zero. ");
               continue;
           }


           // Bill calculation
           double baseAmount = pricePerCup* quantity;
           double gstAmount = baseAmount * GST_RATE;

           double totalBill = baseAmount * gstAmount;

           // Display bill
           System.out.println("\n----- BILL DETAILS -----");
           System.out.println("Coffee Type   : " + coffeeType);
           System.out.println("Price per Cup : ₹" + pricePerCup);
           System.out.println("Quantity      : " + quantity);
           System.out.println("Base Amount   : ₹" + baseAmount);
           System.out.println("GST (5%)      : ₹" + gstAmount);
           System.out.println("Total Bill    : ₹" + totalBill);

       }

       sc.close();
   }

   //Returns the price of coffee based on coffee type.
   private static double getCoffeePrice(String coffeeType) {

        switch (coffeeType) {
            case "espresso":
                return 120.0;
            case "latte":
                return 150.0;
            case "cappuccino":
                return 180.0;
            default:
                return 0.0; // invalid coffee
        }
    }
}


