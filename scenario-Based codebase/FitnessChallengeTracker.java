import java.util.Scanner;


/*
Sandeep’s Fitness Challenge Tracker 

Each day Sandeep completes a number of push-ups.
 Store counts for a week.
 Use for-each to calculate total and average.
 Use continue to skip rest days.
*/

public class FitnessChallengeTracker{

   private static final int  NO_OF_DAYS = 7;



   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       //array to store the 7 days pushups
       int[] pushups = new int[  NO_OF_DAYS  ];

       int sumOfPushups = 0;

       //loop to take input for 7 days
       for( int i=0; i< NO_OF_DAYS; i++){

           System.out.print(" Enter the "+ (i+1)+ "th day Push-Ups:  ");
           pushups[i] = sc.nextInt();

           if(  pushups[i] == 0  ){
                System.out.println(" You didn't Do excercise today!  Why Sandeep?");
          }
       }
       int activeDays =0;

       for( int counter : pushups ){

            if (counter == 0) {
                continue;
            }
           sumOfPushups += counter;
           activeDays++;
       }

 
        // Calculates average safely
        double averagePushups = activeDays > 0 ? (double) sumOfPushups / activeDays : 0;
 


       System.out.println("\n----------------------------Excercise  Summary -----------------------------------");

       System.out.println(" Total push-ups done over 7 days is : " +  sumOfPushups);
       System.out.println(" Active Workout Days: " + activeDays);
       System.out.println(" Average push-ups recorded over 7 days is : " + averagePushups);

       sc.close();

   }
}
