import java.util.Scanner;


// creating a class named HandshakeCalculator to calculate total handshakes

public class HandshakeCalculator {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);


        // Taking number of students as input
        int numberOfStudents = input.nextInt();


        // Formula to calculate maximum handshakes
        // Combination: n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;




        // Displaying output
        System.out.println(
                "The maximum number of possible handshakes is " + handshakes
        );

        // Close scanner resource
        input.close();
    }
}
