package com.constructor.levelone;

/**
 * Base-Class Name: Employee
 * Represents an employee record.
 * Demonstrates public, protected, and private access modifiers.
 */
public class Employee {

    // Public variable (accessible everywhere)
    public int employeeID;

    // Protected variable (accessible in subclass)
    protected String department;

    // Private variable (encapsulated)
    private double salary;

    /**
     * Parameterized constructor
     */
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Getter for salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Public method to modify salary
     */
    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
    }

    /**
     * Displays basic employee details
     */
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}

