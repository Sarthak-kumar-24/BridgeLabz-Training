package com.csvfilehandling.convertJSONtoCSVandviceversa;

//Student POJO
public class Student {
	int id;
	String name;
	int age;
	int marks;

	Student(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	// Convert object to JSON string
	String toJson() {
		return String.format("{\"id\":%d,\"name\":\"%s\",\"age\":%d,\"marks\":%d}", id, name, age, marks);
	}

}
