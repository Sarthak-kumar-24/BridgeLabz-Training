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
public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCourseInfo() {
        return code + " - " + title;
    }
}

