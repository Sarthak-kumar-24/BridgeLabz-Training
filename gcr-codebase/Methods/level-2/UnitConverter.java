

/*
created a class named UnitConverter that extends  
provides static methods to convert
  values between different units such as:
  Kilometers and Miles
  Miles and Kilometers
  Meters and Feet
  Feet and Meters
*/

public class UnitConverter{

    //converts Kilometers and Miles
    public static double convertKmToMiles(double km) {

       
        double km2miles = 0.621371;
       return km * km2miles;
       
   }
   //converts Miles and Kilometers
   public static double convertMilesToKm(double miles) {
       double miles2km = 1.60934;
       return miles * miles2km;
   }

   //converts Meters and Feet
   public static double convertMetersToFeet(double miles) {
       double meters2feet = 3.28084;
       return meters * meters2feet;
   }

   //converts Feet and Meters
   public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}