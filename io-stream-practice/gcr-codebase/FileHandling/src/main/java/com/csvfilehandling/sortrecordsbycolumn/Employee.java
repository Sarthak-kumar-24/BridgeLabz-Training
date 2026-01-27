package com.csvfilehandling.sortrecordsbycolumn;

//Employee class to store CSV data in object form
public class Employee {

	int id;
	String name;
	String department;
	int salary;

	Employee(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

}
