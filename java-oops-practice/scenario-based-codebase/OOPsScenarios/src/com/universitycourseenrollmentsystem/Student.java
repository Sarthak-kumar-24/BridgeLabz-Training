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
public abstract class Student {
    private int id;
    private String name;
    private double gpa;  

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.gpa = 0.0;
    }

    
    public Student(int id, String name, double initialGpa) {
        this.id = id;
        this.name = name;
        this.gpa = initialGpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    
    public String getTranscript() {
        return "Student: " + name + " | GPA: " + gpa;
    }

    
    public abstract void displayInfo();
    
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Sarthak");
        Student s2 = new Postgraduate(201, "Devi jii", 8.5);

        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS201", "Operating Systems");

        Enrollment e1 = new Enrollment(s1);
        e1.enrollCourse(c1);
        e1.enrollCourse(c2);

        e1.calculateGpa(16); // GPA = 16 / 2 = 8.0

        Faculty faculty = new Faculty();

        s1.displayInfo();
        faculty.assignGrade(65);    
        faculty.assignGrade('A');   

        e1.showEnrollment();
    }
}
