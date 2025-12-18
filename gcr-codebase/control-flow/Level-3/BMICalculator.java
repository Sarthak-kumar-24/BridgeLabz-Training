import java.util.Scanner;



//creating a class named BMICalculator to calculate the person BMI

class BMICalculator{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the weight in kg and height in cm   as input
           double  weightInKg = sc.nextDouble();
           double  heightInCm = sc.nextDouble();


           // converting cm to m 
            double heightInMtr = 100 *  heightInCm
            // calculating BMI using formula
            double BMI  =  weightInkg / ( heightInMtr * heightInMtr);


        //giving result according to its BMI

        if( BMI >= 40.0 ){
                 System.out.println("Obese");
       }
        else if ( BMI >= 25.0 && BMI < 40.0 ){
                 System.out.println("Overweight");
       }

       else if ( BMI >= 18.5 && BMI < 25.0){
                 System.out.println("Normal");
       }
      else{
                System.out.println("Underweight");
      }

             
        sc.close();


    }
}