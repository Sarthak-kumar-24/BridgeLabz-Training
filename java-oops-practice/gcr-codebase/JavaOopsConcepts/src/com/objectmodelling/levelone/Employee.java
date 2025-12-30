package com.objectmodelling.levelone;

/*
 * A Company has several Department objects, and each department contains Employee objects.
 * Model this using composition, 
 * where deleting a company should also delete all departments and employees.
 * 
 * Define a Company class that contains multiple Department objects.
 * Define an Employee class within each Department.
 * Show the composition relationship by ensuring that when a Company object 
 * is deleted, all associated Department and Employee objects are also removed.
 */
public class Employee {

	private String name;

	Employee(String name) {
		this.name = name;
	}

	void showEmployee() {
		System.out.println(" Employee: " + name);
	}
}
