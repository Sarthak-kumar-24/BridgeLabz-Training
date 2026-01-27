package com.csvfilehandling.convertdataintojavaobjects;
//Student class representing each CSV record
public class Student {
	int id;
	String name;
	int age;
	int marks;

	// Constructor
	Student(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	// Override toString() for clean printing
	@Override
	public String toString() {
		return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Marks=" + marks + "]";
	}

}
