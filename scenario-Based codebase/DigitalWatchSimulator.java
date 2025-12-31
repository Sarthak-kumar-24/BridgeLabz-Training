/*
Digital Watch Simulation 
Simulate a 24-hour watch:
 Print hours and minutes in a nested for-loop.
 Use a break to stop at 13:00 manually (simulate power cut).
*/

public class DigitalWatchSimulator{

   static final int HOUR = 24;
   static final int MINUTE = 59; 

   public static void main(String[] args){

       int hourHand;
       int minHand;

       // Outer loop for hours (0 to 23)
       for( hourHand = 0; hourHand < HOUR ;hourHand++){

           // Inner loop for minutes (0 to 59)
           for(  minHand =0; minHand <= MINUTE; minHand++){

                // System.out.println("Digital Watch : "+  hourHand + ": "+  minHand);
                 if( hourHand == 13 && minHand ==0){
                  System.out.println("Power cut at 13:00. Watch stopped.");

                   return;
                  }
                 System.out.printf("%02d:%02d%n",hourHand, minHand);

           }
        }
   }

}