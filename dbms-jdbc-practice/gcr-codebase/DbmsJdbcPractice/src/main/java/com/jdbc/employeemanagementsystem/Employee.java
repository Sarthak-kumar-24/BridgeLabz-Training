package com.jdbc.employeemanagementsystem;

/*
 * This class represents an Employee entity
 */
public class Employee {

	private int id;
	private String name;
	private double salary;

	// Constructor without ID (used while inserting)
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Constructor with ID (used while fetching data)
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters (used to access private fields)
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}
