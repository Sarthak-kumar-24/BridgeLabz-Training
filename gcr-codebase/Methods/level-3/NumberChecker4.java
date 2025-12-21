import java.util.Scanner;

/*
created a class named NumberChecker4 that is 
Utility class that performs digit-based operations on a number.
All methods are static and are called from main().
*/

public class NumberChecker4{

   //Checks if a number is prime.
   public static boolean isPrime(int number) {


       if (number <= 1) {
           return false;
       }

       for (int i = 2; i <= Math.sqrt(number); i++) {
           if (number % i == 0) {
               return false;
           }
       }
       return true;
   }

   //Checks if a number is a Neon number.
   public static boolean isNeonNumber(int number) {

       int square = number * number;
       int sum = 0;

       while (square > 0) {
             sum += square % 10;
             square /= 10;
       }

       return sum == number;
   }


   //Checks if a number is a Spy number.
   public static boolean isSpyNumber(int number) {

       int sum = 0;
       int product = 1;
      int temp = Math.abs(number);
               
        while (temp > 0) {
              int digit = temp % 10;
              sum += digit;
              product  *=  digit;
              temp /= 10;
        }
       
       return sum == product;
   }

   //Checks if a number is an Automorphic number.
   public static boolean isAutomorphicNumber(int number) {

      int square = number * number;
      int temp = number;
       

      while (temp > 0) {
           if (temp % 10 != square % 10) {
               return false;
           }
           temp /= 10;
           square /= 10;
       }

       return true;
   }

   //Checks if a number is a Buzz number.
   public static boolean isBuzzNumber(int number) {

       
        return (number % 7 == 0) || (number % 10 == 7);
   }


   public static void main(  String[] args  ) {

       Scanner sc = new Scanner( System.in );

       // Taking input
       System.out.print("Enter a number: ");
       int number = sc.nextInt();

       System.out.println("Is Prime Number: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
       sc.close();
   }
}