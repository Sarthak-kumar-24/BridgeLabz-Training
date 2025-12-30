package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

/*
 * Model a university system with Student, Professor, and Course classes. 
 * Students enroll in courses, and professors teach courses. 
 * Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
 */
public class UniversityCourse {

	private String courseName;
	private Professor professor;
	private List<UniversityStudent> students = new ArrayList<>();

	UniversityCourse(String courseName) {
	        this.courseName = courseName;
	    }

	void assignProfessor(Professor professor) {
		this.professor = professor;
		System.out.println(courseName + " assigned to Prof. " + professor.getName());
	}

	void addStudent(UniversityStudent student) {
		students.add(student);
	}

	String getCourseName() {
		return courseName;
	}

}
