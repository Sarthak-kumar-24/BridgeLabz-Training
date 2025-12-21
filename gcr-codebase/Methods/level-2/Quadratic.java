import java.util.Scanner;

/*
created a class named Quadratic that
 finds the roots of a quadratic equation
 of the form ax^2 + bx + c = 0 using Math functions.
*/

public class Quadratic{


    public double[] findRoots(double a, double b, double c) {

        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive: two real roots
        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };

        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }

        return new double[0];
   }

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Creating object to call non-static method
        Quadratic quadratic = new Quadratic();

        // Finding roots
        double[] roots = quadratic.findRoots(a, b, c);

        // Displaying results
        if (roots.length == 2) {

            System.out.println("Two roots:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {

            System.out.println("One root:");
            System.out.println("Root: " + roots[0]);
        } else {

            System.out.println("No real roots (delta is negative).");
        }

        sc.close();
    }
}