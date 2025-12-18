import  java.util.Scanner;

//creating a class named SumOfNaturalNumbersCheck using while loop and formula 


class SumOfNaturalNumbersCheck{
      public static void main(String[] args){
              Scanner sc = new Scanner(System.in);

              //creating variabes 
              int n = sc.nextInt();
             

             
             // checking if it is natural or not then using while doing the sum
             if( n > 0){
                   int loopSum =0;
                   int i=1;

                  while( i <= n){

                       loopSum += i;
                      i++;
                   }
             }
             

              // sum using formula
              int formulaSum = n*(n+1)/2;



             // Display              
             System.out.println("Sum using while loop: " + loopSum);
             System.out.println("Sum using formula: " + formulaSum);

                // comparing the values
              if(loopSum == formulaSum){

                    System.out.println("Both computations are correct and equal");

               }  else {

                System.out.println("Mismatch in computations");
               }
            

        sc.close();
             

      }
}