package com.functional.model;

/*
 * Student 
 * ------- 
 * Represents a student with basic academic details.
 */
public class Student {

	private String name;
	private int marks;
	private int rank;
	private int age;

	public Student(String name, int marks, int rank, int age) {
		this.name = name;
		this.marks = marks;
		this.rank = rank;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public int getRank() {
		return rank;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " | Marks: " + marks + " | Rank: " + rank + " | Age: " + age;
	}
}
