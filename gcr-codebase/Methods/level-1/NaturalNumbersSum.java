import java.util.Scanner;



/*
created a class named NaturalNumbersSum and method named calculateNaturalNumbersSum that calculates the sum of number 
*/

public class NaturalNumbersSum{

 

   //method to calculate the sum
    public int calculateNaturalNumbersSum(int number){
            int sum = 0;

          // Loop from 1 to n to calculate sum
           for (int i = 1; i <= number; i++) {
               sum += i;
           }

           return sum;
    }



    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a natural number: ");
       int number = sc.nextInt();
       

       //n must be positive
       if(number <=0){
           sc.close();
           System.out.println("give positive number");
           return;
       }


       //creating object 
       NaturalNumbersSum calculator = new NaturalNumbersSum();

       // Calling method to calculate sum
       int result = calculator.calculateNaturalNumbersSum(number);
       

       System.out.println("Sum of first " + number + " natural numbers is: " + result);
        
    sc.close();
   }
}