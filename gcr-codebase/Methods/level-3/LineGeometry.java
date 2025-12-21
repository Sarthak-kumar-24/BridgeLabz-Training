import java.util.Scanner;

/*
  *created a class named LineGeometry that  
 * 1. Euclidean distance between two points
 * 2. Equation of a line (slope and y-intercept)
 */

public class LineGeometry{

   //Finds Euclidean distance between two points.
   //distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
   public static double findDistance( double x1, double y1, double x2, double y2) {


        return Math.sqrt( Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2) );

   }

   /*
    Finds the equation of the line passing through two points.
    m = (y2 - y1) / (x2 - x1)
     b = y1 - m * x1
   */
   public static double[] findLineEquation(  double x1, double y1,  double x2, double y2) {

      double m = (y2 - y1) / (x2 - x1);
      double b = y1 - m * x1;


       return new double[] { m, b };
   }

   //Displays employee data and calculates totals.
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first point
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Input second point
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = findDistance(x1, y1, x2, y2);

        // Calculate line equation
        double[] line = findLineEquation(x1, y1, x2, y2);


        // Display results
        System.out.println("\nEuclidean Distance: " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}

