package com.constructor.levelone;

/**
 * SubClass Name: Manager
 * Subclass of Employee.
 * Demonstrates access to public and protected members.
 */
public class Manager extends Employee {

    private String teamName;

    /**
     * Parameterized constructor
     */
    public Manager(int employeeID, String department,
                   double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    /**
     * Displays manager details
     * Accesses public and protected variables
     */
    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);  // public
        System.out.println("Department  : " + department);  // protected
        System.out.println("Team Name   : " + teamName);
        System.out.println("Salary      : ₹" + getSalary()); // private via getter
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee(101, "IT", 55000);
        emp.displayEmployeeDetails();

        System.out.println("----------------------------------");

        // Modifying salary using public method
        emp.setSalary(60000);
        System.out.println("Updated Salary: ₹" + emp.getSalary());

        System.out.println("----------------------------------");

        // Creating Manager object
        Manager manager = new Manager(
                201,
                "HR",
                85000,
                "Recruitment Team"
        );

        manager.displayManagerDetails();
    }

}

