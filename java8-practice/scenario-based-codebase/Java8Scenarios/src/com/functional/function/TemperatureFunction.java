package com.functional.function;

import java.util.function.Function;

/*
 * TemperatureFunction
 * -----------------------
 * Demonstrates use of Function for numeric transformation.
 * Converts Celsius temperature into Fahrenheit.
 */
public class TemperatureFunction {

	public static void main(String[] args) {

		double sarthakTemp = 25;
		double nishitaTemp = 37;

		// Function: Celsius -> Fahrenheit
		Function<Double, Double> cToF = c -> (c * 9 / 5) + 32;

		printTemp("sarthak", sarthakTemp, cToF);
		printTemp("nishita", nishitaTemp, cToF);
	}

	static void printTemp(String name, double celsius, Function<Double, Double> fn) {

		double f = fn.apply(celsius);

		System.out.println(name + " : " + celsius + "°C = " + f + "°F");
	}

}
