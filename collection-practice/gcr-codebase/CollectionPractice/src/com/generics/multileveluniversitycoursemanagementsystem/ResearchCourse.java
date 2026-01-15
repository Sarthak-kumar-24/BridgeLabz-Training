package com.generics.multileveluniversitycoursemanagementsystem;

public class ResearchCourse extends CourseType{
	
    ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluationMethod() {
        System.out.println(courseName + " : Evaluation: Research Work");
    }

}
