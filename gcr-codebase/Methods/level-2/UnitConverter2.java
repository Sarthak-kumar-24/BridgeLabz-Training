

/*
created a class named UnitConverter2 that extends  
provides static methods to convert
  values between different units such as:
  yards to feet.
  feet to yards
  meters to inches
  inches to meters
  inches to centimeters
*/

public class UnitConverter2{

    //Converts yards to feet.
    public static double convertYardsToFeet(double yards) {


        double yards2feet = 3;
       return yards * yards2feet;
       
   }
   //Converts feet to yards.
   public static double convertFeetToYards(double feet) {
       double feet2yards = 0.33333;
       return feet * feet2yards;
   }

   //Converts meters to inches.
   public static double convertMetersToInches(double meters) {
       double meters2inches = 39.3701;
      return meters * meters2inches;
   }
   //Converts inches to meters.
   public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    //Converts inches to centimeters.
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}