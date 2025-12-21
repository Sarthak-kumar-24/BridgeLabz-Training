import java.util.Scanner;

/*
created a class named FactorCalculator and a method  findFactors to calculate factors and then sum, product and sum of squares of factors
*/

public class FactorCalculator{

   public static int[] findFactors(int number) {
       
       int count = 0;
   
        //finding the number of factors
       for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

       int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

   //Calculates the sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    //Calculates the product of factors.
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

   //Calculates the sum of squares of factors.
   public static double findSumOfSquaresOfFactors(int[] factors) {

        double sumOfSquares = 0;

        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }

        return sumOfSquares;
    }



   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);

       // Taking input from user
       System.out.println("Enter the number: ");
       int number = sc.nextInt();

      // Calling static method to get the array of factors
       int[] factors = findFactors(number);

      System.out.println("Factors of " + number + ":");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

      // passing the factors array as arguments to get sum of factors, product of factors and sum of square of factors
       int sum = findSumOfFactors(factors);
       long product = findProductOfFactors(factors);
       double sumOfSquare = findSumOfSquaresOfFactors(factors);



      // Displaying results
       System.out.println("Sum of factors: " + sum);
       System.out.println("Product of factors: " + product);
       System.out.println("Sum of Squares of factors: " + sumOfSquare);

       sc.close();

   }
}
