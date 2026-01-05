package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

/* CampusConnect – College Information System
 * 
 * Person (base class): common fields like name, email, id.
 * Student and Faculty extend Person (use inheritance).
 * ICourseActions interface with methods like enrollCourse() and dropCourse().
 * Course class has a list of students and a faculty assigned.
 * Use access modifiers: student grades must be private.
 * Polymorphism: printDetails() works differently for Student and Faculty.
 * 
 */
public class Course {
	private String courseName;
	private Faculty faculty;
	private List<Student> students = new ArrayList<>();

	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
		students = new ArrayList<>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public void removeStudent(Student s) {
		students.remove(s);
	}

	public void printCourseDetails() {
		System.out.println("\nCourse: " + courseName);
		System.out.println("Instructor: " + faculty.name);
		System.out.println("Enrolled Students:");
		for (Student s : students) {
			System.out.println("- " + s.name);
		}
	}

}
