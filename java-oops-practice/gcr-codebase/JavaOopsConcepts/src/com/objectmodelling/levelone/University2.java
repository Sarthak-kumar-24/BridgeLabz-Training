package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

/*
 * Model a university system with Student, Professor, and Course classes. 
 * Students enroll in courses, and professors teach courses. 
 * Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
 */
public class University2 {
	
    private String universityName;
    private List<UniversityStudent> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<UniversityCourse> courses = new ArrayList<>();

    University2(String universityName) {
        this.universityName = universityName;
    }

    void addStudent(UniversityStudent student) {
        students.add(student);
    }

    void addProfessor(Professor professor) {
        professors.add(professor);
    }

    void addCourse(UniversityCourse course) {
        courses.add(course);
    }

    public static void main(String[] args) {

        University2 uni = new University2("Tech University");

        UniversityStudent s1 = new UniversityStudent("Aman");
        Professor p1 = new Professor("Dr. Sharma");

        UniversityCourse c1 = new UniversityCourse("Data Structures");

        uni.addStudent(s1);
        uni.addProfessor(p1);
        uni.addCourse(c1);

        s1.enrollCourse(c1);      // Association
        p1.teachCourse(c1);      // Association
    }

}
