import java.util.Scanner;

/*
11. Temperature Logger 
Record temperatures over 7 days.
 Use array and for-loop.
 Find average and max temperature.
 Use if for comparisons. Maintain readable naming and modular code blocks.

*/


public class TemperatureLogger{

   private static final int NO_OF_DAYS = 7;

   //static method to fid the maximum tenperature till now
   public static  double maxTemperatureFinder( double[] temperatures ){

       double maxTemp = 0.0;
       double currTemp = 0.0;


       for( int i=0; i< NO_OF_DAYS; i++){

           currTemp =  temperatures[i];

           if( currTemp > maxTemp ){
               maxTemp = currTemp;
           }
       }
       return maxTemp;
   }


   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       //array to store the7 days temperatures
       double[] temperatures = new double[  NO_OF_DAYS  ];

       double sumOfTemperatures = 0.0;

       //loop to take input for 7 days
       for( int i=0; i< NO_OF_DAYS; i++){

           System.out.print(" Enter the "+ (i+1)+ "th day temperature(in Celcius): ");
           temperatures[i] = sc.nextDouble();

           if(  temperatures[i] > 60 ){
                System.out.println(" Please enter valid temperature! ");
                i--;
          }

           //adding the currnt day temperature
           sumOfTemperatures += temperatures[i];

       }

       //getting max tempearture thorugh static method
       double maxTemperature = maxTemperatureFinder(temperatures );

       double averagetemperature = sumOfTemperatures / NO_OF_DAYS;


       System.out.println("\n----------------------------Temperature Summary -----------------------------------");

       System.out.println(" Max temperature Recorded over 7 days is : " + maxTemperature);

       System.out.println(" Average Temperature recorded over 7 days is : " + averagetemperature);

       sc.close();

   }
}