import java.util.Scanner;

// created a class name  FizzBuzzArray to store FizzBuzz, FIzz, Buzz according to number
class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error");
            sc.close();
            return;
        }

        // Creating  String array to store results (0 to number)
        String[] results = new String[number + 1];

        // Loop from 0 to number and store FizzBuzz values
        for (int i = 0; i <= number; i++) {

            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } 
            else if (i != 0 && i % 3 == 0) {
                results[i] = "Fizz";
            } 
            else if (i != 0 && i % 5 == 0) {
                results[i] = "Buzz";
            } 
            else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results based on index position
        System.out.println("FizzBuzz Results:");

        for (int i = 0; i < results.length; i++) {

            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close scanner
        sc.close();
    }
}
