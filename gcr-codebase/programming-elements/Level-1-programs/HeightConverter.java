import java.util.Scanner;


//Creating a class named HeightConverter to compute height in cm, inch and also in feet


public class HeightConverter {
    public static void main(String[] args) {
         Scanner input = new Scanner( System.in );


        // Take height in centimeters from user
        double heightCm = input.nextDouble();


        // Convert centimeters to total inches, feet(1 foot = 12 inches) and inches
        double totalInches = heightCm / 2.54;
        int feet = (int) ( totalInches / 12);
        double inches = totalInches % 12;



        // Display result
        System.out.println(
                "Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches
        );

        // Close scanner
        input.close();
    }
}
