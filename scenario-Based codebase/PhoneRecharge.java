import java.util.Scanner;

/*
 Phone Recharge Simulator
Take the user's mobile operator and amount.
Use a switch to display offers.
Loop to allow repeated recharges.
Show balance after each recharge.

*/

public class PhoneRecharge{

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       double balance = 0.0;
       boolean continueReacharge = true;

       System.out.println(" Welcome to Phone Recharge Simulator");


       while( continueReacharge ){

           System.out.println(" Choose your Operator! ");
           System.out.println(" 1) Jio ");
           System.out.println(" 2) Airtel ");
           System.out.println(" 3) VI ");

           System.out.print("Enter choice (1-3): ");
           int operator= sc.nextInt();

           System.out.print("Enter recharge amount Rs: ");
           double amount = sc.nextDouble();
           double bonus = 0.0;

           // Display offers using switch
           switch(operator){

                case 1->{
                            System.out.println("""
                     Jio Offers:
                    1. 10% Extra Balance
                    2. 1GB Data Cashback (Rs20)
                    3. Flat Rs30 Cashback on Rs299+ """);

                      System.out.print("Choose offer: ");
                      int offerChoice = sc.nextInt();

                     switch (offerChoice) {
                         case 1 -> bonus = amount * 0.10;
                         case 2 -> bonus = 20;
                         case 3 -> {
                              if (amount >= 299) bonus = 30;
                        }
                           default -> System.out.println(" Invalid offer selected");
                     }
               }

                case 2 ->{
                            System.out.println("""
                     Jio Offers:
                    1. 15% Extra Balance
                    2. 1.5GB Data Cashback (Rs30)
                    3. Flat Rs50 Cashback above  rs299+ """);

                      System.out.print("Choose offer: ");
                      int offerChoice = sc.nextInt();

                     switch (offerChoice) {
                         case 1 -> bonus = amount * 0.15;
                         case 2 -> bonus = 30;
                         case 3 -> {
                              if (amount > 299) bonus = 50;
                        }
                           default -> System.out.println(" Invalid offer selected");
                     }

                }

                case 3 ->{
                     System.out.println("""
                         VI Offers:
                         1. 8% Extra Balance
                         2. Weekend Data Cashback (Rs15)
                         3. Rs40 Cashback on Rs349+
                    """);

                     System.out.print("Choose offer: ");
                     int offerChoice = sc.nextInt();

                    switch (offerChoice) {
                         case 1 -> bonus = amount  * 0.08;
                         case 2 -> bonus = 15;
                         case 3 -> {
                             if (amount >= 349) bonus = 40;
                         }
                          default -> System.out.println(" Invalid offer selected");
                    }

             }
                default ->{
                    System.out.println(" Invalid operator selected!");
                    continue;
                 }
           }


            // Updates balance
            balance += amount + bonus;

            // Show recharge summary
            System.out.println("Recharge Amount : " + amount);
            System.out.println("Bonus Received  : " + bonus);
            System.out.println("Current Balance : " + balance);

            // Ask for another recharge
            System.out.print("\nDo you want to recharge again? (yes/no): ");
            String choice = sc.next().toLowerCase();

            if (!choice.equals("yes")) {
                continueReacharge = false;
            }
        }
   System.out.println(" Thankyou for Recharging ");
   sc.close();

    }
}