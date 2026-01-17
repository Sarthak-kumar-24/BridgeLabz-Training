package com.geomeasuresolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {

	/*
	 * Method to compare two line lengths
	 */
	public static void compareLines(Line l1, Line l2) {

		double len1 = l1.calculateLength();
		double len2 = l2.calculateLength();

		System.out.printf("Line 1 Length: %.2f%n", len1);
		System.out.printf("Line 2 Length: %.2f%n", len2);

		if (len1 == len2) {
			System.out.println(" Both lines are of equal length.");
		} else if (len1 > len2) {
			System.out.println(" Line 1 is longer.");
		} else {
			System.out.println(" Line 2 is longer.");
		}
	}

	/*
	 * Main method – program execution starts here
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> comparisonHistory = new ArrayList<>();

		System.out.println(" GeoMeasure Solutions – Line Comparator");
		System.out.println("----------------------------------------");

		System.out.print("Enter number of line comparisons: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("\nComparison " + i);

			// Input for Line 1
			System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
			Line line1 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

			// Input for Line 2
			System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
			Line line2 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

			// Compare lines
			compareLines(line1, line2);

			comparisonHistory.add("Comparison " + i + " completed");
		}

		// Display comparison history
		System.out.println("\n Comparison History:");
		for (String record : comparisonHistory) {
			System.out.println(record);
		}

		sc.close();
	}

}
