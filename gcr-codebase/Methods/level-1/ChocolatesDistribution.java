import java.util.Scanner;



/*
created a class named ChocolatesDistribution and method named findChocolatesAndRemaining that calculates the number of distributed and remaining chocolates .
*/

public class ChocolatesDistribution{

    public static int[] findChocolatesAndRemaining(int number, int divisor) {

        int chocolatesPerChild = number / divisor;   // Division operator
        int remainingChocolates = number % divisor;  // Modulus operator

        // Returning chocolatesPerChild and remainingChocolates
        return new int[] { chocolatesPerChild, remainingChocolates };
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

      
        
        // Taking user input
        System.out.println("Enter nuber of chocolates : ");
        int n= sc.nextInt();

        System.out.println("Enter Number of Children : ");
        int m= sc.nextInt();

       if (m == 0) {
            System.out.println("Children number cannot be zero.");
            sc.close();
            return;
        }


       // Calculating the distributed chocolates  and remaining by calling the method
       int[] result = findChocolatesAndRemaining(n, m);

       // Displaying result
       
        System.out.println("Distributed Chocolates: " + result[0]);
                                   
   
       System.out.println("Remaining: " + result[1]);
                                    

       sc.close();


   }
}