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
import java.util.ArrayList;

public class Enrollment {
    private Student student;
    private ArrayList<Course> courses = new ArrayList<>();

    public Enrollment(Student student) {
        this.student = student;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void calculateGpa(double totalScore) {
        double gpa = totalScore / courses.size(); 
        student.setGpa(gpa);
    }

    public void showEnrollment() {
        System.out.println(student.getTranscript());
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.getCourseInfo());
        }
    }
}
