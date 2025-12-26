package com.classandobjects.levelone;

/*
 * created class named Employee that
 * program to create an Employee class with attributes name, id, and salary. 
 * Add a method to display the details.
 * 
 */


public class Employee {
	
	//non-static variables
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee( String name, int id, double salary){
		this.name = name;
		this.id= id;
		this.salary = salary;
	}
	
	//creating method to display employee details
	public void displayEmployee() {
		
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee id: "+ id);
		System.out.println("Employee Salary: "+ salary);
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee("Rohan", 1,5000000);
		emp.displayEmployee();//calling the display method


	}

}
