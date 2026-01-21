package com.streams.serialization;

import java.io.Serializable;

/**
 * Employee class represents an employee entity.
 *
 * This class implements Serializable so that its objects can be written to and
 * read from a file.
 *
 * Fields: - id - name - department - salary
 */
public class Employee implements Serializable {
	// Recommended serialVersionUID for Serializable classes
	private static final long serialVersionUID = 1L;

	// Private fields for encapsulation
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	/**
	 * Converts employee object into readable format
	 */
	@Override
	public String toString() {
		return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
	}

}
