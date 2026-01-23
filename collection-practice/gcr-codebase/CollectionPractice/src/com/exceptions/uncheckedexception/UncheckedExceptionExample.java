package com.exceptions.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {
	
    public static void main(String[] args) {

        
    	Scanner sc = new Scanner(System.in);

        try {
            // Asking user to enter first number
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            // Asking user to enter second number
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Division operation
            // May throw ArithmeticException if num2 is 0
            int result = num1 / num2;

            // Printing the result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Division by zero is not allowed");

        } catch (InputMismatchException e) {
            // Handles non-numeric input
            System.out.println("Error: Please enter valid numeric values");

        } finally {
            // Closing scanner resource
            sc.close();
        }
    }

}
