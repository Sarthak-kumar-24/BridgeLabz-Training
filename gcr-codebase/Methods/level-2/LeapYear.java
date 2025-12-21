import java.util.Scanner;


/*
created a class named LeapYear  that checks whether a given year is a Leap Year
*/

public class LeapYear{

    public Boolean leapYearCheck(int year){

       // Condition Gregorian calendar starts from 1582
        if( year < 1582){
           return false;
       }
       //Leap year logic
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
           return true;
       }


       return false;
   }

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       // Taking year input from user
       System.out.print("Enter a year: ");
       int year = sc.nextInt();

       // Creating object to call non-static method
       LeapYear checker = new LeapYear();

       // Checking leap year
       Boolean isLeap = checker.leapYearCheck(year);

       if(year < 1582){
           System.out.println("Leap Year calculation is valid only for years from 1582 onwards.");
       } else if (isLeap){
           System.out.println("The year " + year + " is a Leap Year.");
       } else {
           System.out.println("The year " + year + " is NOT a Leap Year.");
       }

       sc.close();
   }
}