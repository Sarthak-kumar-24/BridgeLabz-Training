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
class School {

    private String schoolName;
    private List<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    // Aggregation: student passed from outside
    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println(" School: " + schoolName);
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student a = new Student("Aman");
        Student b = new Student("Neha");

        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        // Aggregation
        school.addStudent(a);
        school.addStudent(b);

        // Association (many-to-many)
        a.enrollCourse(math);
        a.enrollCourse(cs);

        b.enrollCourse(cs);

        school.showStudents();
        System.out.println();

        a.showCourses();
        System.out.println();

        cs.showStudents();
    }
}


