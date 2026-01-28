package com.functionalinterfaces.unitconversiontool;

/*
 * UnitConverter Interface
 * -----------------------
 * Provides static utility methods
 * for standard unit conversions
 * used in logistics software.
 */
public interface UnitConverter {

	/**
	 * Converts kilometers to miles.
	 */
	static double kmToMiles(double kilometers) {
		return kilometers * 0.621371;
	}

	/**
	 * Converts miles to kilometers.
	 *
	 */
	static double milesToKm(double miles) {
		return miles / 0.621371;
	}

	/**
	 * Converts kilograms to pounds.
	 *
	 */
	static double kgToLbs(double kilograms) {
		return kilograms * 2.20462;
	}

	/**
	 * Converts pounds to kilograms.
	 *
	 */
	static double lbsToKg(double pounds) {
		return pounds / 2.20462;
	}
}
