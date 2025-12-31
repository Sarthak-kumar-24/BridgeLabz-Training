package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

/*School System with Different Roles
 * 
 * Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
 * 
 * Define a superclass Person with common attributes like name and age.
 * Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
 * Each subclass should have a method like displayRole() that describes the role.

 */
public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

