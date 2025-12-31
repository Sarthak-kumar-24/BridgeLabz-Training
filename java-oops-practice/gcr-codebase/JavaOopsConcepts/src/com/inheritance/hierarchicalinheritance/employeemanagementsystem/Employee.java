package com.inheritance.hierarchicalinheritance.employeemanagementsystem;

/*
 * Employee Management System
 * Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
 * 
 * Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
 * Define subclasses Manager, Developer, and Intern with unique attributes for each, 
 * like teamSize for Manager and programmingLanguage for Developer.
 * 
 * 
 * 
 */
public class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: Rs" + salary);
    }
    
    public static void main(String[] args) {

        Employee manager = new Manager("Aman", 101, 90000, 8);
        Employee developer = new Developer("Riya", 102, 70000, "Java");
        Employee intern = new Intern("Karan", 103, 15000, 6);

        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}

