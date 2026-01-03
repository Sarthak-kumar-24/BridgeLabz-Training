package com.linkedlist.singlylinkedlist;

/**
 * Node class represents a single student record.
 */
public class StudentNode {
	
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    // Constructor to initialize a student node.
    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
	
	


}
