import java.util.Scanner;

/*
created a class named TrigonometricCalculator and a method  calculateTrigonometricFunctionsto calculate angles values
*/
public class TrigonometricCalculator{

   public static double[] calculateTrigonometricFunctions(double angle) {
       // Convert degrees to radians
       double radians = Math.toRadians(angle);
   
        // Calculate trigonometric values
       double sine = Math.sin(radians);
       double cosine = Math.cos(radians);
       double tangent = Math.tan(radians);

      // Return results as an array
       return new double[] { sine, cosine, tangent };
   }


   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);

       // Taking angle input from user
       System.out.println("Enter angle in degrees: ");
       double angle = sc.nextDouble();

      // Calling static method using class name

       double[] result = TrigonometricCalculator.calculateTrigonometricFunctions(angle);


      // Displaying results
       System.out.println("Sine value: " + result[0]);
       System.out.println("cosine value: " + result[1]);
       System.out.println("tangent value: " + result[2]);

       sc.close();

   }
}
