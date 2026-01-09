package com.skillforge;

/*
 * SkillForge – Online Learning Portal"
 * 
 * Course class: title, instructor, rating, modules[].
 * User class → Student, Instructor (inheritance).
 * Interface ICertifiable with generateCertificate() method.
 * Polymorphism: certificate format varies per course level.
 * Use operators for grading, progress tracking.
 * 
 */
public class Student extends User implements ICertifiable {
	private int progress; // %
	private int grade; // marks

	public Student(String name) {
		super(name);
		this.progress = 0;
		this.grade = 0;
	}

	public void updateProgress(int completed, int total) {
		this.progress = (completed * 100) / total;
	}

	public void assignGrade(int marks) {
		this.grade = marks;
	}

	@Override
	public void generateCertificate() {
		if (progress == 100 && grade >= 40) {
			System.out.println(" Certificate Generated for " + name);
		} else {
			System.out.println(" Certificate Not Eligible for " + name);
		}
	}

	
	@Override
	public String getRole() {
		return "Student";
	}
}
