package com.constructor.levelone;

/**
 * Class Name: Course
 * Represents a course offered by an institute.
 * Demonstrates:
 * - Instance variables
 * - Static (class) variable
 * - Instance method
 * - Static method
 */
public class Course {

    // Instance variables
    private String courseName;
    private int duration;      // duration in months
    private double fee;

    // Class variable 
    private static String instituteName = "TechVerse Institute";

    /**
     * Parameterized constructor
     * Initializes course details
     */
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    /**
     * Instance method
     * Displays details of a course
     */
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println("----------------------------------");
    }

    /**
     * Static method
     * Updates institute name for all courses
     */
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    /**
     * Main method for testing
     */
    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Structures", 4, 30000);

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating institute name (affects all courses)
        Course.updateInstituteName("NextGen Coding Academy");

        // Display after institute update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
