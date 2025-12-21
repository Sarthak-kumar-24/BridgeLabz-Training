import java.util.Scanner;

/*
created a class named NumberAnalyzer that
Takes 5 numbers as user input
Checks whether each number is positive or negative
For positive numbers, checks whether the number is even or odd
Compares the first and last elements of the array
*/

public class NumberAnalyzer{

    //Checks whether a number is positive.
    public Boolean isPositive(int number){
       return number >0;
   }

   //Checks whether a number is even.
   public class isEven(int number){
       return number % 2==0;
   }

   //Compares two numbers.
   public int compare(int number1, int number2){

       if(number1 > number2){
           return 1;
       }
       else if(number1 == number2){
           return 0;
       }
       else{
           return -1;
       }
   }

   public statuc void main(String[] args){

       Scanner sc =new scanner(system.in);

       // Array to store 5 numbers
       int[] numbers = new int[5];
       // Creating object to call non-static methods
       NumberAnalyzer analyzer = new NumberAnalyzer();


       for(int i=0;i<numbers.length;i++){

           System.out.print("Enter number " + (i + 1) + ": ");
           numbers[i] = sc.nextInt();
       }

       // Loop through array and analyze numbers
       for (int i = 0; i < numbers.length; i++) {

           int current = numbers[i];
           if (analyzer.isPositive(current)) {

               System.out.print(current + " is Positive and ");
               if (analyzer.isEven(current)) {
                   System.out.println("Even");
               } else {
                   System.out.println("Odd");
               }
           }
           else{
               System.out.println(current + " is Negative");
           }
       }
       
        // Comparing first and last elements
        int comparisonResult = analyzer.compare(numbers[0], numbers[numbers.length - 1]);

       if (comparisonResult == 1) {

           System.out.println("First element is greater than last element.");

       } else if (comparisonResult == 0) {

           System.out.println("First and last elements are equal.");
       } else {

           System.out.println("First element is less than last element.");
       }
       sc.close();
   }
}
