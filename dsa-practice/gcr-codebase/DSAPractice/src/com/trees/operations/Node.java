package com.trees.operations;

/**
 * Node class represents a single node in the Binary Search Tree.
 * Each node stores:
 * - student roll number (data)
 * - reference to left child
 * - reference to right child
 */
public class Node {
	
    protected int data;
    protected Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

}
