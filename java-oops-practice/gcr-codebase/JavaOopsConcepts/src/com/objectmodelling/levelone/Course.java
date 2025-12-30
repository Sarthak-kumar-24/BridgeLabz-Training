package com.objectmodelling.levelone;
import java.util.ArrayList;
import java.util.List;

/*
 * Description: Model a School with multiple Student objects, 
 * where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.

 * 
 * 
 */
public class Course {
	
    private String courseName;
    private List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }
    void addStudent(Student student) {
        students.add(student);
    }
    
    void showStudents() {
        System.out.println(" Course: " + courseName);
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}
