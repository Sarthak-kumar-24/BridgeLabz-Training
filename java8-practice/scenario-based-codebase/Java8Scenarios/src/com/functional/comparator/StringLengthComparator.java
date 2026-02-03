package com.functional.comparator;

import java.util.Arrays;
import java.util.List;

/*
 * StringLengthComparator
 * --------------------------
 * Compares strings by their length.
 */
public class StringLengthComparator {
	   public static void main(String[] args) {

	        List<String> names = Arrays.asList(
	                "Sarthak",
	                "Devijii",
	                "Nishita",
	                "Harsh"
	        );

	        names.sort((a, b) -> Integer.compare(a.length(), b.length()));

	        names.forEach(System.out::println);
	    }

}
