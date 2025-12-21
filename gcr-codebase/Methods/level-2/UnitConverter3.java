


/*
created a class named UnitConverter3 that extends  
provides static methods to convert
  values between different units such as:
 Fahrenheit to Celsius
  Celsius to Fahrenheit
  pounds to kilograms
  kilograms to pounds
  gallons to liters
 liters to gallons
*/

public class UnitConverter3{

    //Converts Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double farhenheit) {

       
       double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
       return farhenheit2celsius;
       
   }
   //Converts Celsius to Fahrenheit.
   public static double convertCelsiusToFahrenheit(double celsius) {
       double celsius2farhenheit = (celsius * 9 / 5) + 32;
       return celsius2farhenheit ;
   }

   //Converts  pounds to kilograms.
   public static double convertPoundsToKilograms(double pounds) {
      double pounds2kilograms = 0.453592;
      return pounds * pounds2kilograms;
   }
   //Converts kilograms to pounds.
   public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    //Converts gallons to liters.
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    //Converts liters to gallons .
    public static double convertLitersToGallons (double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

}