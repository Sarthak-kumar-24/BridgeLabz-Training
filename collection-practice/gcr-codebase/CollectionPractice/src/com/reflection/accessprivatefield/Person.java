package com.reflection.accessprivatefield;

/*
 * Person
 * ------
 * A simple class with a private field.
 */
public class Person {

	private int age;

	// Constructor
	public Person(int age) {
		this.age = age;
	}

	// Public method just for comparison
	public int getAge() {
		return age;
	}
}
