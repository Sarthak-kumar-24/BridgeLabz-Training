import java.util.Scanner;



/*
created a class named WindChillCalculator and method named calculateWindChill that calculates the windchill */

public class WindChillCalculator{

    public double calculateWindChill(double temperature, double windSpeed) {

        return 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16);
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

         // Creating object to call method
        WindChillCalculator calculator = new WindChillCalculator();

        // Taking user input
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

       //Basic validation
       if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative");
            sc.close();
            return;
        }


       // Calculating the wind chill by calling the method
       double result =calculator.calculateWindChill(temperature, windSpeed);

       // Displaying result

                                   
   
       System.out.println("Wind Chill Temperature: " + result);
                                    

       sc.close();


   }
}