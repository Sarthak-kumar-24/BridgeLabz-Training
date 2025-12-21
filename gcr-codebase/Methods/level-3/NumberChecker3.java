import java.util.Scanner;

/*
created a class named NumberChecker3 that is 
Utility class that performs digit-based operations on a number.
All methods are static and are called from main().
*/

public class NumberChecker3{

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


   //Reverses a digits array.
   public static int[] reverseDigits(int[] digits) {

       int[] reversed = new int[digits.length];
       for (int i = 0; i < digits.length; i++) {
           reversed[i] = digits[digits.length - 1 - i];
               
       }
       
       return reversed;
   }

   //Compares two arrays for equality.
   public static boolean compareArrays(int[] arr1, int[] arr2) {

       if (arr1.length != arr2.length) {
           return false;
       }
       

       for (int i = 0; i < arr1.length; i++) {
           if (arr1[i] != arr2[i]) {
               return false;
           }
       }

       return true;
   }

   //Checks if a number is a palindrome.
   public static boolean isPalindrome(int[] digits) {

       int[] reversed = reverseDigits(digits);
       
        return compareArrays(digits, reversed);
   }




   //Checks if a number is a Duck number.
   public static boolean isDuckNumber(int[] digits) {


    if (digits[0] == 0) {
        return false;
    }

    // Check for at least one zero in remaining digits
    for (int i = 1; i < digits.length; i++) {

        if (digits[i] == 0) {
            return true;
        }
    }

    return false;
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


       // Reverse digits
        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

       // Palindrome check
       System.out.println("Is Palindrome: " + isPalindrome(digits));

       // Duck number check
 
       System.out.println("Is Duck Number: " + isDuckNumber(digits));

       sc.close();
   }
}