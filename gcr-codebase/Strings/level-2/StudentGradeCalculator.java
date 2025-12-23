/**
 * created a class named  StudentGradeCalculator that
 * 1) Generates random 2-digit marks for Physics, Chemistry, and Maths
 * 2) Calculates total, average, and percentage (rounded to 2 decimals)
 * 3) Assigns grades based on percentage
 * 4) Displays a complete scorecard in tabular format
 */

public class StudentGradeCalculator {


   public static int[][] generatePCMScores(int students) {
       int[][] scores = new int[students][3];

       for (int i = 0; i < students; i++) {
           scores[i][0] = (int) (Math.random() * 100); // Physics
           scores[i][1] = (int) (Math.random() * 100); // Chemistry
           scores[i][2] = (int) (Math.random() * 100); // Maths
       }
    return scores;
}


   public static double[][] calculateResults(int[][] pcmScores) {

       double[][] results = new double[pcmScores.length][3];
       for (int i = 0; i < pcmScores.length; i++) {

           int total = pcmScores[i][0] + pcmScores[i][1] + pcmScores[i][2];
           double average = total / 3.0;
           double percentage = (total / 300.0) * 100;

           average = Math.round(average * 100.0) / 100.0;
           percentage = Math.round(percentage * 100.0) / 100.0;


           results[i][0] = total;
           results[i][1] = average;
           results[i][2] = percentage;

       }
       return results;
   }

   public static String[] calculateGrades(double[] percentages) {
  
       String[] grades = new String[percentages.length];
       for (int i = 0; i < percentages.length; i++) {
           double p = percentages[i];

           if (p >= 80) grades[i] = "A";
           else if (p >= 70) grades[i] = "B";
           else if (p >= 60) grades[i] = "C";
           else if (p >= 50) grades[i] = "D";
           else if (p >= 40) grades[i] = "E";
           else grades[i] = "R";
        }
       return grades;
   }


    public static void displayScorecard(
            int[][] pcm,
            double[][] results,
            String[] grades
    ) {

        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 5; // You can change this

        // Step 1: Generate PCM scores
        int[][] pcmScores = generatePCMScores(numberOfStudents);

        // Step 2: Calculate total, average, percentage
        double[][] results = calculateResults(pcmScores);

        // Extract percentages for grade calculation
        double[] percentages = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            percentages[i] = results[i][2];
        }

        // Step 3: Calculate grades
        String[] grades = calculateGrades(percentages);

        // Step 4: Display scorecard
        displayScorecard(pcmScores, results, grades);
    }
}



































