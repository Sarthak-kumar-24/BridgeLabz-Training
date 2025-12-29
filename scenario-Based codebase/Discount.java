import  java.util.Scanner;


/*
Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
 Input item prices in a for-loop.
 Use if-else for discount logic.
 Use proper indentation, constants, and comments.



*/

public class Discount{

    private static final double DISCOUNT_10_PERCENT = 0.10;
    private static final double DISCOUNT_20_PERCENT = 0.20;
   private static final double DISCOUNT_15_PERCENT = 0.15;


   public static void main( String[] args){

       Scanner sc = new Scanner( System.in);

       //taking total items numbers as input
       System.out.println(" Enter the number of Items");
       int itemCount = sc.nextInt();
       double totalBill = 0.0;


       for( int i=0; i< itemCount; i++){

          //taking price of eac item
           System.out.print(" Enter the price of  " + ( i+1) + "th  Item :  ");
           double price = sc.nextDouble();
       if( price <= 0){
             System.out.println(" Please add item which has a price ");
             i--;

         }

           //adding all the prices 
           totalBill += price;

       }

       double discountAmount  = 0.0;

       //applying dicount based on price
       if( totalBill >= 5000){
  
           discountAmount = totalBill * DISCOUNT_20_PERCENT;
       }
       else if ( totalBill >= 2000 && totalBill < 5000){
  
           discountAmount = totalBill * DISCOUNT_15_PERCENT;
       }
        else{

           discountAmount = totalBill * DISCOUNT_10_PERCENT;
       }

       //calculating the final amount after discount
       double finalAmount = totalBill - discountAmount;

       System.out.println( " \n----------------------------------Bill SUMMARY----------------------------------------");

       System.out.println(" Total Bill Amount: "+ totalBill );
       System.out.println(" Total Discount Applied: " + discountAmount );
       System.out.println(" Final Amount:  " + finalAmount );
       System.out.println(" Thanks for visiting us" );

       System.out.println( " \n----------------------------------Thanku----------------------------------------");

       sc.close();

   }
}