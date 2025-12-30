package com.objectmodelling.levelone;

/*
 * Model a university system with Student, Professor, and Course classes. 
 * Students enroll in courses, and professors teach courses. 
 * Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
 */
public class Professor {

    private String name;

    Professor(String name) {
        this.name = name;
    }

    void teachCourse(UniversityCourse course) {
        course.assignProfessor(this);
    }

    String getName() {
        return name;
    }

}
