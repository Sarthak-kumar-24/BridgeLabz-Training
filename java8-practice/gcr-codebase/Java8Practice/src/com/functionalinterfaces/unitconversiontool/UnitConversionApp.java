package com.functionalinterfaces.unitconversiontool;

/*
 * UnitConversionApp
 * -----------------
 * Demonstrates unit conversions
 * using static interface methods.
 */
public class UnitConversionApp {

	public static void main(String[] args) {

		double distanceKm = 120.0;
		double weightKg = 75.0;

		// Distance conversions
		System.out.println(distanceKm + " km = " + UnitConverter.kmToMiles(distanceKm) + " miles");

		// Weight conversions
		System.out.println(weightKg + " kg = " + UnitConverter.kgToLbs(weightKg) + " lbs");
	}
}
