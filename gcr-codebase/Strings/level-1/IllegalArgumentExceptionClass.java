import java.util.Scanner;

/*
 created a class named IllegalArgumentExceptionClass that
 demonstrates:
 1) How IllegalArgumentException is generated
 2) How it is handled using try-catch
 3) How RuntimeException can act as a generic fallback
 */
public class IllegalArgumentExceptionClass {

    //  generates IllegalArgumentException
    public static void generateException(String text) {

        // Indexes are within bounds but logically invalid
        System.out.println(text.substring(2, 1));
    }

    // Method that handles exceptions internally
    public static void handleException(String text) {

        try {
            System.out.println(text.substring(2, 1));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught and handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        String text = sc.next();

        // Ensure string is long enough to avoid IndexOutOfBounds
        if (text.length() < 3) {
            System.out.println("Input string must have at least 3 characters.");
            sc.close();
            return;
        }

        // Handling exception thrown by another method
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred in generateException().");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred in generateException().");
        }

        // Handling exception inside the method
        handleException(text);

        sc.close();
    }
}


