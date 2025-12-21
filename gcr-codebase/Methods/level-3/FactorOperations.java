import java.util.Scanner;

/*
created a class named FactorOperations that is 
Utility class to find factors of a number and perform
various operations using the factors array.
*/

public class FactorOperations{

   //Finds all factors of a number and returns them as an array.
   public static int[] findFactors(int number) {


      int count = 0;


       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
               count++;
           }
       }
       int[] factors = new int[count];
       int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
   }

   //Finds the greatest factor using factors array.
   public static int findGreatestFactor(int[] factors) {


      int max = factors[0];
      for (int f : factors) {
            if (f > max) {
                 max = f;
            }

     }

      return max;
   }


   //Checks if a number is an Abundant number.
   public static boolean isAbundantNumber(int number) {


               
       if (number <= 0) {
              return false;

        }
       
       return sumOfProperDivisors(number) > number;
   }

   //Finds the sum of factors.
   public static int findSumOfFactors(int[] factors) {



      int sum = 0;
      for (int f : factors) {

               sum += f;

       }

       return sum;
   }

   //Calculates factorial of a digit.
   public static int factorial(int digit) {

        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
   }

    //Finds the product of factors.
   public static long findProductOfFactors(int[] factors) {

       long product = 1;


        for (int f : factors) {
            product *= f;

        }

        return product;
    }

   //Finds the product of cubes of the factors.
   public static double findProductOfCubes(int[] factors) {

        double product = 1;

        for (int f : factors) {
            product *= Math.pow(f, 3);
        }

        return product;
    }


   public static void main(  String[] args  ) {

       Scanner sc = new Scanner( System.in );

       // Taking input
       System.out.print("Enter a number: ");
       int number = sc.nextInt();

       // Finding factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Performing operations
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));

       sc.close();
   }
}