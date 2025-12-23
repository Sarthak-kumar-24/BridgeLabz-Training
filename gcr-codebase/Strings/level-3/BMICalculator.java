import java.util.Scanner;

/**
 * created a class named  BMICalculator that
 * calculates the Body Mass Index (BMI) for a team of 10 members.
 * It stores height and weight, computes BMI and status, and displays
 * the results in a tabular format.
 */


public class BMICalculator {


   public static String[][] calculateBMIAndStatus(double[][] data) {
       String[][] result = new String[data.length][4];

       for (int i = 0; i < data.length; i++) {
           double weight = data[i][0];
           double heightCm = data[i][1];
           double heightMeter = heightCm / 100.0;

           double bmi = weight / (heightMeter * heightMeter);
           bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

           String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result
   }

   public static void displayBMIReport(String[][] table) {

       System.out.println("\nID\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

       for (int i = 0; i < table.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    table[i][0] + "\t\t" +
                    table[i][1] + "\t\t" +
                    table[i][2] + "\t" +
                    table[i][3]
            );
        }
    }


   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Taking input for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiReport = calculateBMIAndStatus(data);

        // Display result
        displayBMIReport(bmiReport);

        sc.close();
    }
}


























