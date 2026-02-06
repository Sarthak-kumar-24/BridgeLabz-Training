package com.functional.model;

/*
 * Employee 
 * -------- 
 * Represents an employee with basic office details.
 */
public class Employee {

	private String name;
	private double salary;
	private int experience; // in years

	public Employee(String name, double salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getExperience() {
		return experience;
	}

	@Override
	public String toString() {
		return name + " | Salary: Rs" + salary + " | Experience: " + experience + " years";
	}
}
