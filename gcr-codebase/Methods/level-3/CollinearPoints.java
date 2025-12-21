import java.util.Scanner;

/*
created a class named CollinearPoints that  
This program checks whether three points are collinear
using:
1. Slope formula
2. Area of triangle formula
Checks collinearity using slope method.
slope AB = (y2 - y1) / (x2 - x1)
slope BC = (y3 - y2) / (x3 - x2)
slope AC = (y3 - y1) / (x3 - x1)

Points are collinear if all slopes are equal.
*/

public class CollinearPoints{

   //Checks collinearity using slope method.
   public static boolean isCollinearUsingSlope(  int x1,  int y1,  int x2,  int y2, int x3,  int y3) {

        return (y2 - y1) * (x3 - x2) ==
            (y3 - y2) * (x2 - x1)
             &&
            (y3 - y1) * (x2 - x1) ==
            (y2 - y1) * (x3 - x1);

   }

   //Checks collinearity using area of triangle formula.
   //area = 0.5 * ( x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2) )
   public static boolean isCollinearUsingArea( int x1, int y1, int x2, int y2, int x3, int y3) {

      double area = 0.5 * ( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

      return area == 0;
   }


   public static void main(  String[] args  ) {

       Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Slope method check
        boolean slopeResult = isCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3);

        // Area method check
        boolean areaResult = isCollinearUsingArea(
                x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing Slope Method: "
                + (slopeResult ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Method: "
                + (areaResult ? "Collinear" : "Not Collinear"));
       sc.close();
   }
}