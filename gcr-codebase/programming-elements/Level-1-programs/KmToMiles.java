import java.util.Scanner;

// creating a class names KmToMiles to convert user given distance to Miles
public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Declared variable to store kilometers and 
        double km;
        // Read kilometer value from user
        km = input.nextInt();



        // Conversion formula: 1 mile = 1.6 km
        double miles = km / 1.6;



        // Display result
        System.out.println(
                "The total miles is " +  miles + " mile for the given " + km + " km"
        );

    }
}
