package com.jsonfilehandling.convertalistofjavaobjectsintoaJSONarray;

/**
 * Car class represents the structure of each Java object that will be converted
 * into JSON format.
 */
public class Car {

	// Variable to store car brand
	private String brand;

	// Variable to store car model
	private String model;

	// Variable to store manufacturing year
	private int year;

	/**
	 * Parameterized constructor to initialize Car object
	 */
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	/**
	 * Getter method for brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Getter method for model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Getter method for year
	 */
	public int getYear() {
		return year;
	}
}
