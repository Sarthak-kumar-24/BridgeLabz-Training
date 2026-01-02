package com.universitycourseenrollmentsystem;

/* University Course Enrollment System
 * 
 * Scenario: Students should be able to enroll in courses, and faculty can assign grades.
 * 
 * Class: Student, Course, Faculty, Enrollment
 * Constructors: Used to create students with/without elective preferences
 * Access Modifiers: private for internal GPA fields, public method to access
 * Interface: Graded with method assignGrade()
 * Operators: GPA calculations and comparisons (using +, /, etc.)
 * Inheritance: Undergraduate, Postgraduate extend Student
 */
public class Postgraduate extends Student {

    public Postgraduate(int id, String name, double initialGpa) {
        super(id, name, initialGpa);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate Student");
    }
}

