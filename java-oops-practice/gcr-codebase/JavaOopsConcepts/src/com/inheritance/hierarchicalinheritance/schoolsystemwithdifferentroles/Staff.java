package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

/*School System with Different Roles
 * 
 * Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
 * 
 * Define a superclass Person with common attributes like name and age.
 * Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
 * Each subclass should have a method like displayRole() that describes the role.

 */
public class Staff extends Person {

    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

