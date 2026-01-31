package com.streamAPI.iotsensorreadings;

import java.util.Arrays;
import java.util.List;

/*
 * IoTSensorReadings
 * ----------------
 * Prints sensor readings
 * above a specified threshold
 * using Stream API.
 */
public class IoTSensorReadings {

	public static void main(String[] args) {

		// List of sensor readings
		List<Double> sensorReadings = Arrays.asList(23.5, 45.2, 67.8, 30.1, 80.6, 55.4);

		// Threshold value
		double threshold = 50.0;

		System.out.println(" Sensor readings above threshold (" + threshold + "):");

		// Stream processing
		sensorReadings.stream().filter(reading -> reading > threshold)
				.forEach(reading -> System.out.println(" High Reading: " + reading));
	}
}
