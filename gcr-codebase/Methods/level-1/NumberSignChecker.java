import java.util.Scanner;




/*
created a class named NumberSignChecker and method named checkNumberSign that finds the sign of number and return values
*/

public class NumberSignChecker{

   
   //method to check sign of number
    public int checkNumberSign(int number){

       if( number > 0){
           return 1;
       }
       else if( number == 0){
           return 0;
       }

       if( number < 0){
           return -1;
       }

    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

         // Creating object to call method
       NumberSignChecker checker = new NumberSignChecker();

        // Taking user input
        System.out.println("Enter length ofside A(in meters) : ");
        int number = sc.nextInt();
   

       // Calling method to check number signr
        int result = checker.checkNumberSign(number);
     
        if (result == 1) {

            System.out.println("The number is POSITIVE.");
        } else if (result == -1) {

            System.out.println("The number is NEGATIVE.");
        } else {

            System.out.println("The number is ZERO.");
        }                                    
                                
     
       sc.close();


   }
}