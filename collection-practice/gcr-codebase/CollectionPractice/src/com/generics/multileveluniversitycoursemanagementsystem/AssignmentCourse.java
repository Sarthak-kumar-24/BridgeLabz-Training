package com.generics.multileveluniversitycoursemanagementsystem;

public class AssignmentCourse extends CourseType{
	
    AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluationMethod() {
        System.out.println(courseName + " : Evaluation: Assignments");
    }

}
