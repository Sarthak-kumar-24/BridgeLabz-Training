package com.exceptions.finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExample {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

           
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Performing integer division
            // May throw ArithmeticException if num2 is 0
            int result = num1 / num2;

            // Printed only if no exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero");

        } finally {
            // This block ALWAYS executes
            // Whether exception occurs or not
            System.out.println("Operation completed");

            // Closing scanner resource
            sc.close();
        }
    }

}
