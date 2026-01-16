package com.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
=========================================================
Program: Invert a Map
Purpose:
- Invert a Map<K, V> to Map<V, List<K>>
- Handles duplicate values by grouping keys in a list
=========================================================
*/
public class InvertMap {
	
    // Method to invert the map
    private static <K, V> Map<V, List<K>> invert(Map<K, V> original) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // Add key to the list corresponding to the value
            inverted
                .computeIfAbsent(value, v -> new ArrayList<>())
                .add(key);
        }

        return inverted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter key-value pairs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Key: ");
            String key = sc.nextLine();

            System.out.print("Value: ");
            int value = sc.nextInt();
            sc.nextLine();

            map.put(key, value);
        }

        Map<Integer, List<String>> invertedMap = invert(map);

        System.out.println("Inverted Map: " + invertedMap);

        sc.close();
    }

}
