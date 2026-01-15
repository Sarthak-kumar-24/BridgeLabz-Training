package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
	
    private List<T> courses = new ArrayList<>();

    // Add a course
    void addCourse(T course) {
        courses.add(course);
    }

    // Get list of courses
    List<T> getCourses() {
        return courses;
    }

}
