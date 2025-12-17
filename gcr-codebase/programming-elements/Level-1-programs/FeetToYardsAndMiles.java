import java.util.Scanner;

//creating a class named  FeetToYardsAndMiles to Convert distance from feet to yard and miles



public class FeetToYardsAndMiles {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);


        // Taking distance in feet from user
        double distanceInFeet = input.nextDouble();



        // Converting feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        // Converting  yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;


        // Displaying the  result
        System.out.println(
                "The distance in feet is " + distanceInFeet +
                " while in yards is " + distanceInYards +
                " and miles is " + distanceInMiles
        );

        // Close scanner
        input.close();
    }
}
