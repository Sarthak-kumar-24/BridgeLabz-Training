package com.reflection.dynamicallycreateobjects;

/*
 * Student
 * -------
 * Simple student class.
 */
public class Student {

    private int id;
    private String name;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

