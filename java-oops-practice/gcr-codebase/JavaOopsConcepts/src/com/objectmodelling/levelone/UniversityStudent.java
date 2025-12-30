package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

/*
 * Model a university system with Student, Professor, and Course classes. 
 * Students enroll in courses, and professors teach courses. 
 * Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
 */
public class UniversityStudent {
	
    private String name;
    private List<UniversityCourse> courses = new ArrayList<>();

    UniversityStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.addStudent(this);

        System.out.println(name +
                " enrolled in " + course.getCourseName());
    }

    String getName() {
        return name;
    }

}
