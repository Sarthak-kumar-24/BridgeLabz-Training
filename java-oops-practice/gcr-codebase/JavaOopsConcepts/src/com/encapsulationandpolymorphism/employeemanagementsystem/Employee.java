package com.encapsulationandpolymorphism.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

/*
 * Employee Management System
 * Description: Build an employee management system with the following requirements:
 * 
 * Use an abstract class Employee with fields like employeeId, name, and baseSalary.
 * Provide an abstract method calculateSalary() and a concrete method displayDetails().
 * Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
 * Use encapsulation to restrict direct access to fields and provide getter and setter methods.
 * Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
 * Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
 * 
 */

abstract class Employee implements Department {
	
	private int employeeId;
	private String name;
	protected double baseSalary;
	private String department;
	
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    
    // Department methods
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
    
   
    public abstract double calculateSalary();
    

    //concrete method 
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: Rs" + calculateSalary());
    }
    
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Aman", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 40, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------------");
        }
    }
	
}
