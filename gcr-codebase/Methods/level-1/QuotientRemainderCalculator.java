import java.util.Scanner;



/*
created a class named QuotientRemainderCalculator and method named findRemainderAndQuotientr that calculates the remainder an quotient and return them .
*/

public class QuotientRemainderCalculator{

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   // Division operator
        int remainder = number % divisor;  // Modulus operator

        // Returning quotient and remainder
        return new int[] { quotient, remainder };
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

       
      
        // Taking user input
        System.out.println("Enter first number : ");
        int number= sc.nextInt();

        System.out.println("Enter second number : ");
        int divisor= sc.nextInt();

       if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            sc.close();
            return;
        }


       // Calculating the quotient and remainder by calling the method
       int[] result = findRemainderAndQuotient(number, divisor);

       // Displaying result
       
        System.out.println("Quotient: " + result[0]);
                                   
   
       System.out.println("Remainder: " + result[1]);
                                    

       sc.close();


   }
}