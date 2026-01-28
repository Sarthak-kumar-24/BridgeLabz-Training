package com.lambdaexp.nameuppercasing;

import java.util.*;
import java.util.stream.Collectors;

public class HRLetterApp {

	public static void main(String[] args) {

		List<String> employeeNames = Arrays.asList("Rahul", "Sneha", "Amit", "Priya");
		// Converts all names to uppercase
		List<String> upperCaseNames = employeeNames.stream().map(String::toUpperCase).collect(Collectors.toList());

		// Print for HR verification
		upperCaseNames.forEach(System.out::println);
	}
}
