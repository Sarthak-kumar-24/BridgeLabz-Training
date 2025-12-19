import java.util.Scanner;

// created a class named  BMICalculator to calculate the bmi

class BMICalculator{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //taking input and string them
         int number = sc.nextInt();
         int[] weights= new int[number];
         int[] heights = new int[number];
         float[] BMIs = new float[number];
         String[] weightStatus = new String[number];

         //loop to fill arrays by input
         for( int i=0;i< number; i++){
              weights[i] = sc.nextInt();
              heights[i] = sc.nextInt();
         }

         int height =0;
         int weight =0;
         float BMI =0;
 

         //loop to calculate BMI based of height and weight
         for( int i=0;i< number; i++){

             height = heights[i];
             weight =weights[i];

             BMI = weight / ( height * height );

             BMIs[i] = BMI;

             //giving status based on BMI
             if( BMI >= 40.0 ){
                  weightStatus[i] = "Obese";
  
             }
             else if( BMI >= 25.0 && BMI < 40.0 ){
                 weightStatus[i] = "Overweight";
             }

             else if(  BMI >= 18.5 && BMI < 25.0){
                  weightStatus[i] = "Normal";
             }

             else{
                  weightStatus[i] = "Underweight";
             }

         }

         // printing the results i.e height, weight, BMI, weightStatus
         for(int i=0;i<number;i++){
              System.out.println("height : "+ heights[i]);
               System.out.println("weight : "+ weights[i]);
               System.out.println("BMI : "+ BMIs[i]);
               System.out.println("Status : "+ weightStatus[i]);
           }

       sc.close();

    }
}
