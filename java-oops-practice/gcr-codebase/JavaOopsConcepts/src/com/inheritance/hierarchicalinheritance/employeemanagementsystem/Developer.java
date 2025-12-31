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
public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}
