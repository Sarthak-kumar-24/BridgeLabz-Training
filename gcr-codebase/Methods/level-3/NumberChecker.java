import java.util.Scanner;

/*
created a class named NumberChecker that is 
Utility class to perform various operations on a number
using its digits.
*/

public class NumberChecker{

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


   //Checks if a number is a Duck number.
   public static boolean isDuckNumber(int[] digits){

       for(int digit: digits){
           if(digit != 0){
               return true;
           }
       }
       return false;
   }

   //Checks if a number is an Armstrong number.
   public static boolean isArmStrongNumber(int[] digits, int originalNumber){

       int power = digits.length;
       int sum =0;

       for(int digit : digits){
           sum += Math.pow( digit, power );
       }
       return sum == originalNumber;
   }

   // Finds the largest and second largest digits.
   public static int[] findLargestAndSecondLargest( int[] digits ){

       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;


       for(int digit : digits){

           if( digit > largest){
               secondLargest = largest;

               largest = digit;
           }
           else if ( digit > secondLargest && digit != largest ){
               secondLargest = digit;
           }
        }
        return new int[] ( largest,  secondLargest};
   }




   //Finds the smallest and second smallest digits.
   public static int[] findSmallestAndSecondSmallest(int[] digits){

       int smallest = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;

       for (int digit : digits) {
           if (digit   <   smallest) {
               secondSmallest = smallest;
               smallest  =  digit;
           } else if (digit   <   secondSmallest && digit   !=   smallest) {
               secondSmallest  =  digit;
           }
       }
       return new int[] { smallest,  secondSmallest };
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

       // Duck number check
       System.out.println("Is Duck Number: " + isDuckNumber(  digits  ));

       // Armstrong number check
       System.out.println("Is Armstrong Number: " +isArmstrongNumber(  digits, Math.abs(number)));

       // Largest & second largest
       int[] largest = findLargestAndSecondLargest( digits );
       System.out.println("Largest digit: " + largest[ 0 ]);
       System.out.println("Second largest digit: " + largest[ 1 ]);

       // Smallest & second smallest
       int[] smallest = findSmallestAndSecondSmallest( digits );
       System.out.println("Smallest digit: " + smallest[ 0 ]);
       System.out.println("Second smallest digit: " + smallest[1]);

       sc.close();
   }
}