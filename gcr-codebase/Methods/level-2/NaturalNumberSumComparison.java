import java.util.Scanner;

/*
created a class named NaturalNumberSumComparison that 
calculates the sum of first 'n' natural numbers
 using:
 1. Recursive method
 2. Mathematical formula
 and compares both results.
*/

class NaturalNumberSumComparison{

    public int calculateSumUsingRecursion(int n) {

       if(n ==1){
           return 1;
       }
       return n + calculateSumUsingRecursion(n -1);
   }
    public int calculateSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter a natural number: ");
           int n = sc.nextInt();

           if (n <= 0) {
               System.out.println("Error: Please enter a valid natural number.");
               sc.close();
               return;
           }
           // Creating object to call non-static methods
           NaturalNumberSumComparison calculator = new NaturalNumberSumComparison();

           // Calculating sum using recursion
           int recursiveSum = calculator.calculateSumUsingRecursion(n);
           // Calculating sum using formula
           int formulaSum = calculator.calculateSumUsingFormula(n);

           // Displaying results
           System.out.println("Sum using recursion: " + recursiveSum);
           System.out.println("Sum using formula: " + formulaSum);

           // Comparing both results
           if(recursiveSum == formulaSum){
              System.out.println("Result is correct: ");
           }
           else{
               System.out.println("Results is incorrect");
           }

           sc.close();

   }
}
