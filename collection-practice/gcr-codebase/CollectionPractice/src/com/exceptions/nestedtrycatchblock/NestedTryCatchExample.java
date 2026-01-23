package com.exceptions.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchExample {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int[] arr = {10, 20, 30, 40, 50};

        try {
            
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            // Outer try: handles array index related issues
            int value = arr[index];

            try {
                // Taking divisor input
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Inner try: handles division related issues
                int result = value / divisor;

                // Printed only if both operations are successful
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                // Handles division by zero
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index
            System.out.println("Invalid array index!");
        } finally {
            // Closing scanner resource
            sc.close();
        }
    }

}
