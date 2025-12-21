import java.util.Scanner;

/*
created a class named NumberChecker2 that is 
Utility class that performs digit-based operations on a number.
All methods are static and are called from main().
*/

public class NumberChecker2{

   //Finds the count of digits in a number.
   public static int countDigits(int number){
       int count =0;
       int temp = Math.abs(number);

       if(temp ==0){
           return 1;
       }

       while(temp > 0){
           count ++;
           temp /= 10;
       }
       return count;
   }

   //Stores digits of a number into an array.
   public static int[]  storeDigits(int number){

       int count = countDigits(number);
       int[] digits = new int[count];

       int temp = Math.abs(number);
       int index = count -1;

       if(temp == 0){
           digits[0] = 0;
           return digits;
       }

       while(temp > 0){
           digits[index--] = temp% 10;
           temp /= 10;
       }

       return digits;
   }


   //Finds the sum of digits using digits array.
   public static int sumOfDigits(int[] digits) {

       int sum = 0;
       for(int digit: digits){
           sum += d;
               
       }
       
       return sum;
   }

   //Finds the sum of squares of digits using Math.pow().
   public static double sumOfSquaresOfDigits(int[] digits) {

       double sum = 0;
       

       for(int digit : digits){
           sum += Math.pow(digit, 2);
       }

       return sum;
   }

   //Checks if a number is a Harshad number.
   public static boolean isHarshadNumber(int number, int[] digits) {

       int sum = sumOfDigits(digits);
       

       if (sum == 0) {

           
             return false;

               
        }
        return number % sum == 0;
   }




   //Finds frequency of each digit.
   public static int[][] digitFrequency(int[] digits) {

       int[][] frequency = new int[10][2];
       

       for (int i = 0; i < 10; i++) {
           frequency[i][0] = i;
           frequency[i][1] = 0;
           
       }
        for (int d : digits) {
            frequency[d][1]++;
        }
       return frequency;
   }


   public static void main(  String[] args  ) {

       Scanner sc = new Scanner( System.in );

       // Taking input
       System.out.print("Enter a number: ");
       int number = sc.nextInt();

       // Count digits
       int digitCount = countDigits(number);
       System.out.println("Digit count: " + digitCount);

       // Store digits
       int[] digits = storeDigits(number);
       System.out.print(" Digits:  ");
       for (int d : digits) {
           System.out.print(d + " ");
       }
       System.out.println();

       // Sum of digits
       System.out.println("Sum of digits: " + sumOfDigits(digits));

       //Sum of squares of digits
       System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

       // Harshad number check
 
       System.out.println("Is Harshad Number: " + 
                                              isHarshadNumber(Math.abs(number), digits));


       System.out.println("Digit Frequency:");
        System.out.println("Digit\tCount");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
       sc.close();
   }
}