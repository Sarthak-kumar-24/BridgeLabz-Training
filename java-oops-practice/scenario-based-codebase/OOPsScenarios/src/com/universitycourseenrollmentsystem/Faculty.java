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
public class Faculty implements Graded {

    
    @Override
    public void assignGrade(double score) {
        if (score >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

   
    public void assignGrade(char letter) {
        System.out.println("Assigned Grade: " + letter);
    }
}

