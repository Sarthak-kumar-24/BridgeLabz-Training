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
public class Intern extends Employee{

    private int internshipDuration; // in months

    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }

}
