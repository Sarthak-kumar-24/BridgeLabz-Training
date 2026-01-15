package com.generics.multileveluniversitycoursemanagementsystem;

/**
 * CourseType is an abstract class that represents
 * the evaluation style of a university course.
 *
 * All specific evaluation types must extend this class.
 */
public abstract class CourseType {
	
    protected String courseName;

    // Constructor
    CourseType(String courseName) {
        this.courseName = courseName;
    }

    // Abstract method to describe evaluation type
    abstract void evaluationMethod();

}
