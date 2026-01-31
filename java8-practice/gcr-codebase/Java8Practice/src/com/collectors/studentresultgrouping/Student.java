package com.collectors.studentresultgrouping;

public class Student {

	String name;
	String grade;

	// Constructor
	Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for grade
	public String getGrade() {
		return grade;
	}
}
