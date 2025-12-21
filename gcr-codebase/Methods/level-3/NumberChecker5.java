import java.util.Scanner;

/*
created a class named NumberChecker5 that is 
Utility class that performs digit-based operations on a number.
All methods are static and are called from main().
*/

public class NumberChecker5{

   //Calculates the sum of proper divisors of a number.
   public static int sumOfProperDivisors(int number) {


       int sum = 0;


       for (int i = 1; i <= number / 2; i++) {
           if (number % i == 0) {
               sum += i;
           }
       }
       return sum;
   }

   //Checks if a number is a Perfect number.
   public static boolean isPerfectNumber(int number) {



      if (number <= 0) {
            return false;

     }

       return sumOfProperDivisors(number) == number;
   }


   //Checks if a number is an Abundant number.
   public static boolean isAbundantNumber(int number) {


               
       if (number <= 0) {
              return false;

        }
       
       return sumOfProperDivisors(number) > number;
   }

   //Checks if a number is a Deficient number.
   public static boolean isDeficientNumber(int number) {



      if (number <= 0) {

               return false;

       }

       return sumOfProperDivisors(number) < number;
   }

   //Calculates factorial of a digit.
   public static int factorial(int digit) {

        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
   }

    //Checks if a number is a Strong number.
    public static boolean isStrongNumber(int number) {

        int temp = Math.abs(number);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }



   public static void main(  String[] args  ) {

       Scanner sc = new Scanner( System.in );

       // Taking input
       System.out.print("Enter a number: ");
       int number = sc.nextInt();

       // Display results
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
       sc.close();
   }
}