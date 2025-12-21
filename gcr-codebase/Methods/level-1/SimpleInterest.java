import java.util.Scanner;




/*
created a class named SimpleInterest and method nnamed calculateSimpleInterest that calculates simple interest.
*/

public class SimpleInterest{

    public double calculateSimpleInterest(double principal, double rate, double time){
        return (principal * rate * time) / 100;
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

         // Creating object to call method
        SimpleInterest calculator = new SimpleInterest();

        // Taking user input
        System.out.println("Enter Principal: ");
        double principal= sc.nextDouble();

       System.out.println("Enter Rate of Interest: ");
       double rate= sc.nextDouble();

       System.out.println("Enter Time: ");
       double time= sc.nextDouble();


       // Basic validation to ensure positive values
       if(principal <= 0 || rate <= 0 || time <= 0){
           System.out.println("Error: All must be positive");
           sc.close();
           return;
       }

       // Calling instance method
       double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

       // Displaying result
       System.out.println(
                                     "The Simple Interest is " + simpleInterest+
                                      " for Principal " + principal +
                                     ", Rate of Interest " + rate +
                                     " and Time " + time
       );
       sc.close();


   }
}