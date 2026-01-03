package com.linkedlist.singlylinkedlist;

/**
 * StudentLinkedList
 * This program demonstrates a Singly Linked List used for
 * managing student records.
 *
 * Each node stores:
 *  - Roll Number
 *  - Name
 *  - Age
 *  - Grade
 *
 * Supported operations:
 *  - Insert at beginning, end, and specific position
 *  - Delete a record using roll number
 *  - Search a student using roll number
 *  - Update grade using roll number
 *  - Display all student records
 */
public class StudentLinkedList {
	
	//Head pointer of the singly linked list
	private StudentNode head;
	
	//Inserts a student record at the beginning of the list.
	void addAtBeginning( int rollNo, String name, int age, char grade) {
		StudentNode newNode = new StudentNode( rollNo, name, age, grade);
		
		newNode.next = head;
		head = newNode;
	}
	
	//Inserts a student record at the end of the list
	void addAtEnd( int rollNo, String name, int age, char grade ) {
		StudentNode newNode = new StudentNode( rollNo, name, age, grade);
		
		if( head == null) {
			head = newNode;
			return;
		}
		StudentNode temp = head;
		while( temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		
	}
	
	//Inserts a student record at a specific position
	void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
	    if (pos == 1) {
	        addAtBeginning(rollNo, name, age, grade);
	        return;
	    }
	    StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	    
	    StudentNode temp = head;
	    for (int i = 1; i < pos - 1 && temp != null; i++) {
	        temp = temp.next;
	    }
	    
	    if (temp == null) {
	        System.out.println("Invalid position");
	        return;
	    }
	    
	    newNode.next = temp.next;
	    temp.next = newNode;
		
	}
	
	//Deletes a student record using roll number
	void deleteByRollNo(int rollNo) {
		if (head == null) return;
		
		if (head.rollNo == rollNo) {
	        head = head.next;
	        return;
	    }
		
		StudentNode temp = head;
		while (temp.next != null && temp.next.rollNo != rollNo) {
	        temp = temp.next;
	    }

		
		if (temp.next == null) {
	        System.out.println("Student not found");
	    } else {
	        temp.next = temp.next.next;
	    }

	}
	
	//Searches for a student using roll number
	void search(int rollNo) {
	    StudentNode temp = head;

	    while (temp != null) {
	        if (temp.rollNo == rollNo) {
	            System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
	            return;
	        }
	        temp = temp.next;
	    }
	    System.out.println("Student not found");
	}
	
	//Updates the grade of a student using roll number
	void updateGrade(int rollNo, char newGrade) {
	    StudentNode temp = head;

	    while (temp != null) {
	        if (temp.rollNo == rollNo) {
	            temp.grade = newGrade;
	            System.out.println("Grade updated successfully");
	            return;
	        }
	        temp = temp.next;
	    }
	    System.out.println("Student not found");
	}
	
	//Displays all student records in the list
	void displayAll() {
	    if (head == null) {
	        System.out.println("No student records");
	        return;
	    }

	    StudentNode temp = head;
	    while (temp != null) {
	        System.out.println(
	            "Roll: " + temp.rollNo +
	            ", Name: " + temp.name +
	            ", Age: " + temp.age +
	            ", Grade: " + temp.grade
	        );
	        temp = temp.next;
	    }
	}
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Aman", 20, 'A');
        list.addAtEnd(102, "DeviJii", 21, 'B');
        list.addAtEnd(103, "Sarthak", 22, 'C');
        list.addAtEnd(103, "Ravi", 22, 'C');
        list.addAtEnd(103, "Harsh", 22, 'C');
        list.addAtEnd(103, "Shivmani", 22, 'C');
        list.addAtEnd(103, "Yuraj", 22, 'C');

        list.addAtPosition(2, 104, "Sita", 19, 'A');

        System.out.println("All Students:");
        list.displayAll();

        list.search(102);
        list.updateGrade(103, 'A');

        list.deleteByRollNo(101);

        System.out.println("\nAfter Deletion:");
        list.displayAll();
    }

}
