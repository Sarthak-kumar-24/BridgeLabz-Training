package com.exceptions.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array declared (can be set to null to test NullPointerException)
        int[] arr = {10, 20, 30, 40, 50};

        try {
            
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Accessing array element at given index
            int value = arr[index];

            // Printed only if no exception occurs
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles case when index is invalid
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            // Handles case when array is null
            System.out.println("Array is not initialized!");

        } finally {
            // Closing scanner resource
            sc.close();
        }
    }
}
