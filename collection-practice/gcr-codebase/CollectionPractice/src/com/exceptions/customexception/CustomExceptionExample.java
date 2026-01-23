package com.exceptions.customexception;

import java.util.Scanner;

public class CustomExceptionExample {
	
    // Throws InvalidAgeException if age is below 18
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // Throwing custom exception
            throw new InvalidAgeException("Age must be 18 or above");
        }

        // Executes only if age is valid
        System.out.println("Access granted!");
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking age input from user
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Calling validation method
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Handling custom exception
            System.out.println(e.getMessage());
        } finally {
            // Closing scanner resource
            sc.close();
        }
    }

}
