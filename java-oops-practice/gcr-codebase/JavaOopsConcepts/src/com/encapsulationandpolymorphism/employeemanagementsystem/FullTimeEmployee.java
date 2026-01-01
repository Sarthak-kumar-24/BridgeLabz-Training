package com.encapsulationandpolymorphism.employeemanagementsystem;

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

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; 
    }
}
