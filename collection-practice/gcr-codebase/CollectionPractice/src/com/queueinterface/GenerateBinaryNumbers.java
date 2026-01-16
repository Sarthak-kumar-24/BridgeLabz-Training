package com.queueinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
=========================================================
Program: Generate Binary Numbers Using a Queue
Purpose:
- Generate the first N binary numbers as strings
- Uses Queue data structure
- Avoids direct binary conversion
=========================================================
*/
public class GenerateBinaryNumbers {
	
    // Method to generate binary numbers
    private static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Start with "1"
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);

            // Generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        List<String> binaries = generateBinary(n);
        System.out.println("Binary Numbers: " + binaries);

        sc.close();
    }

}
