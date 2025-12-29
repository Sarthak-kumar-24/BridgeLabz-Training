import java.util.Random;
import java.util.Scanner;

/*
 The Number Guessing Game 
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
 Use do-while loop.
 Give hints like "Too high" or "Too low".
 Count attempts and exit after 5 wrong tries.

*/
public class NumberGuessingGame{

   //method to generaten the guess
   public static int generateGuess(int low, int high, Random random){

       return random.nextInt(high - low +1) + low;
   }


   //method to get feedback from user
   public static String getFeedback( Scanner sc){

       System.out.println("Is the guess HIGH, LOW or CORRECT? ");
       return sc.next().toLowerCase();
   }

    // Updates range based on feedback
    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1;
        } else if (feedback.equals("low")) {
            range[0] = guess + 1;
        }
    }

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);
       Random random = new Random();

       int low =1;
       int high = 100;
       int attempts =0;
       int maxAttempts = 5;


       do{

           System.out.println(" Guess you number! between 1 to 100 ");
           int guess = generateGuess( low, high, random);
           attempts++;

           System.out.println(" Guess:  "+ guess);
           String feedback = getFeedback(sc);

           //checks if the guess is correct oin attempts
            if (feedback.equals("correct")) {
                System.out.println("\n I gussed the  number in " + attempts + " attempts!");
                break;
            }

            int[ ] range = { low, high };
            updateRange(feedback, guess, range);

            low = range[0];
            high = range[1];

            // Safety check
            if (low > high) {
                System.out.println("Check your answers!");
                break;
            }
            if (attempts == maxAttempts) {
                System.out.println("\n I ran out of attempts!");
            }
       }

       while(attempts < maxAttempts);


        
   sc.close();

}

}