package com.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
=========================================================
Program: Rotate Elements in a List

- Rotate elements of a list by a given number of positions
- Does NOT use built-in rotation methods
- Uses manual reversal technique
=========================================================
*/
public class RotateList {

	// Reverse a portion of the list
	private static void reverse(List<Integer> list, int start, int end) {
		while (start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
	}

	// Rotate list by k positions to the left
	private static void rotate(List<Integer> list, int k) {
		int n = list.size();
		if (n == 0)
			return;

		k = k % n; // handle large rotations

		// Step 1: Reverse first k elements
		reverse(list, 0, k - 1);

		// Step 2: Reverse remaining elements
		reverse(list, k, n - 1);

		// Step 3: Reverse entire list
		reverse(list, 0, n - 1);
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

		System.out.print("Enter rotation count: ");
		int k = sc.nextInt();

		rotate(list, k);

		System.out.println("Rotated List: " + list);
		sc.close();
	}

}
