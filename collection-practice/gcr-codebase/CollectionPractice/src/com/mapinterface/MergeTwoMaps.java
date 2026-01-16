package com.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
=========================================================
Program: Merge Two Maps
Purpose:
- Merge two Map<String, Integer>
- If a key exists in both maps, sum their values
- If a key exists in only one map, keep its value
=========================================================
*/
public class MergeTwoMaps {

	// Method to merge two maps
	private static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

		Map<String, Integer> result = new HashMap<>();

		// Add all entries from map1
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			result.put(entry.getKey(), entry.getValue());
		}

		// Merge entries from map2
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		// Input Map 1
		System.out.print("Enter number of entries in Map 1: ");
		int n1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Map 1 key-value pairs:");
		for (int i = 0; i < n1; i++) {
			System.out.print("Key: ");
			String key = sc.nextLine();
			System.out.print("Value: ");
			int value = sc.nextInt();
			sc.nextLine();
			map1.put(key, value);
		}

		// Input Map 2
		System.out.print("Enter number of entries in Map 2: ");
		int n2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Map 2 key-value pairs:");
		for (int i = 0; i < n2; i++) {
			System.out.print("Key: ");
			String key = sc.nextLine();
			System.out.print("Value: ");
			int value = sc.nextInt();
			sc.nextLine();
			map2.put(key, value);
		}

		// Merge maps
		Map<String, Integer> mergedMap = mergeMaps(map1, map2);

		// Output
		System.out.println("Merged Map: " + mergedMap);

		sc.close();
	}

}
