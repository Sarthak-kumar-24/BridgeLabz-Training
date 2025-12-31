package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

/*School System with Different Roles
 * 
 * Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
 * 
 * Define a superclass Person with common attributes like name and age.
 * Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
 * Each subclass should have a method like displayRole() that describes the role.

 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to be overridden
    public void displayRole() {
        System.out.println("Role: Person");
    }
    public static void main(String[] args) {

        Person p1 = new Teacher("Aman", 35, "Maths");
        Person p2 = new Student("Riya", 16, "10th Grade");
        Person p3 = new Staff("Karan", 42, "Administration");

        p1.displayRole();
        System.out.println();

        p2.displayRole();
        System.out.println();

        p3.displayRole();
    }
}

