package com.generics.multileveluniversitycoursemanagementsystem;

public class ExamCourse extends CourseType{
	
    ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluationMethod() {
        System.out.println(courseName + " : Evaluation: Written Exams");
    }

}
