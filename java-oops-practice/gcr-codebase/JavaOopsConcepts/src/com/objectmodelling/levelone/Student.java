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
class Student {

    private String name;
    private List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // association (two-way)
    }

    void showCourses() {
        System.out.println(" Student: " + name);
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }

    String getName() {
        return name;
    }
}
