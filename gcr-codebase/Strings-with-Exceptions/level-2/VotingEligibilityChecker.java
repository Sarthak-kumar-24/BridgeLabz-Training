import java.util.Scanner;

/**
 * created class named  VotingEligibilityChecker that
 * 1) Takes ages of students as input
 * 2) Stores ages in a 1D array
 * 3) Determines whether each student can vote or not
 * 4) Stores age and voting status in a 2D array
 * 5) Displays the result in tabular format
 */

public class VotingEligibilityChecker {

   //Creates and returns a 1D array of student ages.
   public static int[] createAgeArray(int... ages) {
       return ages;
   }

   //Determines voting eligibility for each age.
   public static String[][] checkVotingEligibility(int[] ages) {

       String[][] result = new String[ages.length][2];

       for(int i=0; i< ages.length; i++){

           int age = ages[i];
           boolean canVote= false;

           if(age >= 18){
               canVote = true;
           }

           result[i][0] = String.valueOf(age);
           result[i][1] = String.valueOf(canVote );
       }

       return result;

   }


   public static void displayTable(String[][] table) {

        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("--------------------------");

        for (int i = 0; i < table.length; i++) {
            int age = Integer.parseInt(table[i][0]);
            boolean canVote = Boolean.parseBoolean(table[i][1]);

            System.out.println((i + 1) + "\t\t" + age + "\t" + canVote);
        }
    }




   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       int[] ages = new int[10];
       for(int i=0;i<ages.length; i++){

           System.out.println("Enter age of student " + (i+1) + ": ");
           ages[i] = sc.nextInt();
       }

       int[] ageArray = createAgeArray(
                       ages[0], ages[1], ages[2], ages[3], ages[4],
                       ages[5], ages[6], ages[7], ages[8], ages[9]
       );



       String[][] result = checkVotingEligibility(ageArray);

       displayTable(result);


       sc.close();
   }
}

