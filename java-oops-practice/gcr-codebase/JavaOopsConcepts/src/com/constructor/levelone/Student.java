package com.constructor.levelone;

/**
 * Created a Class named Student that
 * Represents a student in a university system.
 * Demonstrates use of public, protected, and private access modifiers.
 */
public class Student {

    // Public variable 
    public int rollNumber;

    // Protected variable 
    protected String name;

    // Private variable 
    private double cgpa;

    /**
     * Parameterized constructor
     */
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    /**
     * Public getter for CGPA
     */
    public double getCgpa() {
        return cgpa;
    }

    /**
     * Public setter for CGPA
     */
    public void setCgpa(double cgpa) {
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new IllegalArgumentException("CGPA must be between 0 and 10");
        }
        this.cgpa = cgpa;
    }

    /**
     * Displays basic student details
     */
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + cgpa);
    }
}

