import java.util.Scanner;



//creating a class named CalculatorUsingSwitch to do basic operations using switch

class CalculatorUsingSwitch{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the numbers  as input
           double  first = sc.nextDouble();
           double  second = sc.nextDouble();
           String op = sc.next();
           


          // Perform operation using switch-case
          switch(op){

                case "+": 
                          System.out.println("Result: "  + (first + second));
                          break;

                case "-": 
                          System.out.println("Result: "  + (first - second));
                          break;


                case "*": 
                          System.out.println("Result: "  + (first * second));
                          break;


                case "/": 
                        if( second != 0){
                                  System.out.println("Result: "  + (first / second));
                         } else {
                                  System.out.println(" Division by zero is not allowed");
                         }
                         break;


                default:
                      System.out.println("Invalid Operator");
 
            }

           sc.close();
 

     }
}