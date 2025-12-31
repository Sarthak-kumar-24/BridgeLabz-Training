import java.util.Scanner;

/*
18. Currency Exchange Kiosk 
Design a currency converter:
Take INR amount and target currency.
Use a switch to apply the correct rate.
 Ask if the user wants another conversion (do-while).
*/
public class CurrencyExchange{

   public static void main( String[]  args){

       Scanner sc = new Scanner( System.in);

       System.out.print("Enter your Currency amount: ");
       double  rupees = sc.nextDouble();


       while( true ){

            System.out.println("\nSelect target currency:");
            System.out.println("1) Dollar");
            System.out.println("2) Euro");
            System.out.println("3) Ruble");
            System.out.println("4) Pound");
           System.out.print("\n Enter yur choice: ");
            int targetCurrecy = sc.nextInt();

            double convertedAmount;
            switch( targetCurrecy ){

               case 1 :

                   convertedAmount = rupees * 0.011;
                   System.out.println(" Rupee: " + rupees);
                   System.out.println(" In Dollar: " + convertedAmount);
                   break;

               case 2 :

                   convertedAmount = rupees * 0.0095;

                   System.out.println(" Rupee: " + rupees);
                   System.out.println("In Euro: " + convertedAmount);
                   break;

               case 3 :

                   convertedAmount = rupees * 0.90;

                   System.out.println(" Rupee: " + rupees);
                   System.out.println(" In Ruble: " + convertedAmount);
                   break;

               case 4 :

                   convertedAmount = rupees * 0.0083;

                   System.out.println(" Rupee: " + rupees);
                   System.out.println(" In Pound: " + convertedAmount);
                   break;


               default:

                   System.out.println(" You entered other currency");
                   continue;

           }
 
           System.out.print(" Do you want to continue with other curreny? (yes/no): ");
           sc.nextLine();
           String  response = sc.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                System.out.println(" Thank you for using Currency Exchange!");
                break;
            }


       }
   sc.close();

   }
}