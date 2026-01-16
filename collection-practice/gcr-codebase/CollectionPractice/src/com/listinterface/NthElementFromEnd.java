package com.listinterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
=========================================================
Program: Find the Nth Element from the End
Purpose:
- Find the Nth element from the end of a singly linked list
- Does NOT calculate the size of the list
- Uses two-pointer (fast & slow) technique
=========================================================
*/
public class NthElementFromEnd {
	// Method to find Nth element from the end
	private static String findNthFromEnd(LinkedList<String> list, int n) {
		Iterator<String> fast = list.iterator();
		Iterator<String> slow = list.iterator();

		// Move fast pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (!fast.hasNext()) {
				return null; // n is greater than list size
			}
			fast.next();
		}

		// Move both pointers until fast reaches end
		while (fast.hasNext()) {
			fast.next();
			slow.next();
		}

		return slow.next();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int size = sc.nextInt();
		sc.nextLine();

		LinkedList<String> list = new LinkedList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextLine());
		}

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		String result = findNthFromEnd(list, n);

		if (result != null) {
			System.out.println("Nth element from the end: " + result);
		} else {
			System.out.println(" Invalid N (greater than list size)");
		}

		sc.close();
	}

}
