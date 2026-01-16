package com.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
=========================================================
Program: Find Frequency of Elements

- Count frequency of each string in a list
- Store result in Map<String, Integer>
- Uses HashMap for efficient counting
=========================================================
*/
public class FrequencyOfElements {
	
    // Method to calculate frequency
    private static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            // Increment count if exists, else put 1
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        // Input strings
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        // Find and display frequency
        Map<String, Integer> result = findFrequency(list);
        System.out.println("Frequency Map: " + result);

        sc.close();
    }

}
