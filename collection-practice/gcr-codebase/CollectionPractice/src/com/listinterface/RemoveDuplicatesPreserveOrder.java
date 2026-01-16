package com.listinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
=========================================================
Program: Remove Duplicates While Preserving Order
Purpose:
- Remove duplicate elements from a list
- Maintain the original insertion order
- Uses Set for tracking seen elements
=========================================================
*/
public class RemoveDuplicatesPreserveOrder {

	// Method to remove duplicates while preserving order
	private static List<Integer> removeDuplicates(List<Integer> list) {
		Set<Integer> seen = new HashSet<>();
		List<Integer> result = new ArrayList<>();

		for (int num : list) {
			if (!seen.contains(num)) {
				seen.add(num);
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		List<Integer> output = removeDuplicates(list);
		System.out.println("List after removing duplicates: " + output);

		sc.close();
	}

}
