package com.universitydigitalrecordsystem;


public class Node {

	int roll;
	String name;
	Node left, right;

	Node(int roll, String name) {
		this.roll = roll;
		this.name = name;
		left = right = null;
	}
}
