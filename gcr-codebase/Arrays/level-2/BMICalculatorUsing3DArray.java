import java.util.Scanner;

// created a class named  BMICalculatorUsing3DArray  to calculate the BMI

class BMICalculatorUsing3DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input and string them
        int number = sc.nextInt();


        if(number <=0){
            System.out.println("Error: ");
            sc.close();
            return;
        }



        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];


        for(int i=0; i < number;  i++){
            System.out.println("Enter details for Person " + (i+1));

            System.out.print("Weight: ");
            double weight = sc.nextDouble();

            System.out.println("Height:  ");
            double height = sc.nextDouble();


            if(weight <= 0 || height <= 0){
                System.out.println("Enter positive values only. ");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

     for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            // BMI formula
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // f. Determine weight status using BMI table
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }


     System.out.println("\n===== BMI REPORT =====");
        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println();
        }


       sc.close();

    }
}
