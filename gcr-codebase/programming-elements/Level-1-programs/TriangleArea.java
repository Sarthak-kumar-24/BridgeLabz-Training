import java.util.Scanner;

//creating a class named TriangleArea to compute the area of given triangle


public class TriangleArea {

    public static void main(String[] args) {

               Scanner input = new Scanner(System.in);

        // Taking  base and height in inches
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Area of triangle formula: 1/2 * base * height
        double areaInSqInches = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm
        // So, 1 sq inch = (2.54 * 2.54) sq cm
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;

        // Display output
        System.out.println(
                "The area of triangle in square inches is " + areaInSqInches +
                " and in square centimeters is " + areaInSqCm
        );

        // Close scanner
        input.close();
    }
}
