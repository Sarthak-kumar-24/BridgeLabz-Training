package com.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 =========================================================
 Program: Find the Key with the Highest Value
 Purpose:
 - Given a Map<String, Integer>, find the key
   that has the maximum value
 =========================================================
*/
public class MaxValueKey {
	// Method to find key with maximum value
	private static String findMaxKey(Map<String, Integer> map) {
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		return maxKey;
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

		String result = findMaxKey(map);
		System.out.println("Key with highest value: " + result);

		sc.close();
	}

}
