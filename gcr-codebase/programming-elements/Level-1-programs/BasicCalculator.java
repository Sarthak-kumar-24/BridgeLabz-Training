import java.util.Scanner;

//Creating a class named BasicCalculator to do basic calculation tasks



public class BasicCalculator {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

        // Taking  number inputs
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();


        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;


        // Displaying  results in a single print statement
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division
        );

        // Close scanner resource
        input.close();
    }
}
