import java.util.Scanner;

/*
created a class named BMICalculator that
 calculates BMI for 10 team members
 using their weight and height, stores values in a
2D array, and determines BMI status for each person.
*/

public class BMICalculator{


    public void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];       // weight in kg
            double heightCm = data[i][1];     // height in cm

            // Convert height from cm to meters
            double heightMeters = heightCm / 100;

            // Calculate BMI
            double bmi = weight / (heightMeters * heightMeters);

            // Store BMI in third column
            data[i][2] = bmi;
        }
    }

   public String[] determineBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: rows = 10 persons, columns = weight, height, BMI
        double[][] data = new double[10][3];

        // Taking input
        for (int i = 0; i < data.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Creating object to call non-static methods
        BMICalculator calculator = new BMICalculator();

        // Calculating BMI
        calculator.calculateBMI(data);

        // BMI status
        String[] bmiStatus = calculator.determineBMIStatus(data);

        // Displaying  results
        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
       System.out.println(
          (i + 1) + "\t" +
         data[i][0] + "\t" +
         data[i][1] + "\t" +
        data[i][2] + "\t" +
        bmiStatus[i]
        );
        }

        sc.close();
    }
}