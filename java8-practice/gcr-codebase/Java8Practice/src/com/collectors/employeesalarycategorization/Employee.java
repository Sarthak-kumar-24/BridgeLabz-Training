package com.collectors.employeesalarycategorization;

public class Employee {

	String name;
	String department;
	double salary;

	// Constructor
	Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

}
