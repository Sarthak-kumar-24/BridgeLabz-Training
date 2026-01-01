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

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

