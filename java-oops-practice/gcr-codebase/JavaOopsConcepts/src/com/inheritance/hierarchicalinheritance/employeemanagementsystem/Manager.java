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
public class Manager extends Employee {


    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
