package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

/*School System with Different Roles
 * 
 * Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
 * 
 * Define a superclass Person with common attributes like name and age.
 * Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
 * Each subclass should have a method like displayRole() that describes the role.

 */
public class Student extends Person {

    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

