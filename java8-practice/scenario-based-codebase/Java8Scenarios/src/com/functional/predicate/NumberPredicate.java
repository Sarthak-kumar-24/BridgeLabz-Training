package com.functional.predicate;

import java.util.function.Predicate;

/*
 * NumberPredicate
 * -------------------
 * Demonstrates use of Predicate for a basic numeric rule.
 * Checks whether a number is even or odd using lambda.
 */
public class NumberPredicate {

	public static void main(String[] args) {

		int n1 = 24;
		int n2 = 17;

		// Predicate: true if even
		Predicate<Integer> isEven = n -> n % 2 == 0;

		checkNumber(n1, isEven);
		checkNumber(n2, isEven);
	}

	static void checkNumber(int num, Predicate<Integer> rule) {

		if (rule.test(num)) {
			System.out.println(num + " Even");
		} else {
			System.out.println(num + " Odd");
		}
	}
}
