package com.trees.operations;


/**
 * -------------------------------------------------------
 * StudentBST class performs all BST operations required
 * for the student attendance system.
 *
 * Operations included:
 * - Insert roll numbers
 * - Delete a roll number (including node with two children)
 * - Inorder traversal
 * - Range-based search
 * ------------------------------------------------------
 */

public class StudentBST {
	
    // Insert node
    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    // Find minimum value node
    static Node minValueNode(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Delete node
    static Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Node with two children
            if (root.left != null && root.right != null) {
                Node successor = minValueNode(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
            // One or zero child
            else
                root = (root.left != null) ? root.left : root.right;
        }
        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Print range
    static void printRange(Node root, int low, int high) {
        if (root == null) return;

        if (root.data > low)
            printRange(root.left, low, high);

        if (root.data >= low && root.data <= high)
            System.out.print(root.data + " ");

        if (root.data < high)
            printRange(root.right, low, high);
    }

    public static void main(String[] args) {

        int[] values = {15, 10, 20, 8, 12, 17, 25};
        Node root = null;

        for (int v : values)
            root = insert(root, v);

        // Delete 10
        root = delete(root, 10);

        // Insert 14 and 9
        root = insert(root, 14);
        root = insert(root, 9);

        System.out.println("Inorder Traversal after operations:");
        inorder(root);

        System.out.println("\n\nStudents with roll numbers between 10 and 20:");
        printRange(root, 10, 20);
    }

}
