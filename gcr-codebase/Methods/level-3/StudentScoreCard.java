import java.util.Scanner;

/*
  *created a class named StudentScoreCard that  
 * generates marks for students in Physics,
 * Chemistry, and Math, calculates total, average, percentage,
 * assigns grades, and displays the scorecard.
 */

public class StudentScoreCard{

   //Generates random 2-digit PCM scores for students.
   public static int[][] generatePCMScores(int students) {

       int[][] scores = new int[students][3];
           for (int i = 0; i < students; i++) {
               scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
               scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
               scores[i][2] = (int) (Math.random() * 90) + 10; // Math
           }

        return scores;

   }

   //Calculates total, average, and percentage.
   public static double[][] calculateResults(int[][] scores) {

      double[][] results = new double[scores.length][3];
       for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
   }

   public static String getGrade(double percentage) {

        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    //Displays the scorecard in tabular format.
    public static void displayScoreCard(  int[][] scores,  double[][] results) {

        System.out.println(
            "Stud\tPhy\tChem\tMath\tTotal\tAverage\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {

            String grade = getGrade(results[i][2]);

            System.out.printf(
                "%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s%n",
                (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                results[i][0],
                results[i][1],
                results[i][2],
                grade
            );
        }
    }

   
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate marks
        int[][] scores = generatePCMScores(students);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScoreCard(scores, results);

        sc.close();
    }
}

