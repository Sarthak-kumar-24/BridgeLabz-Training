package com.functionalinterfaces.temperaturealertsystem;

import java.util.Scanner;
import java.util.function.Predicate;

/*
 * TemperatureAlertSystem
 * ----------------------
 * Uses Predicate<Double> to check
 * whether temperature crosses a
 * predefined threshold.
 */
public class TemperatureAlertSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Define threshold temperature
		final double THRESHOLD_TEMPERATURE = 40.0;

		// Predicate to check if temperature exceeds threshold
		Predicate<Double> temperatureAlert = temp -> temp > THRESHOLD_TEMPERATURE;

		// Take temperature input from user
		System.out.print("Enter current temperature: ");
		double currentTemperature = scanner.nextDouble();

		// Check and trigger alert
		if (temperatureAlert.test(currentTemperature)) {
			System.out.println(" ALERT: Temperature crossed the safe limit!");
		} else {
			System.out.println(" Temperature is within the safe range.");
		}

		scanner.close();
	}
}
