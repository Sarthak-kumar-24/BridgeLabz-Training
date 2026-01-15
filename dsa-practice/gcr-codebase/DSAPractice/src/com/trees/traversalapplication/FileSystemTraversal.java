package com.trees.traversalapplication;

public class FileSystemTraversal {
	
    // Preorder Traversal (Root → Left → Right)
	// list all files in alphabetical order,
    public static void preorder(FileNode node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left → Root → Right)
    //To calculate the total size of a directory (sum of all files in subdirectories),
    public static void inorder(FileNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.name + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left → Right → Root)
    // Backup of entire directory structure
    public static void postorder(FileNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.name + " ");
    }

    public static void main(String[] args) {

        // Building the file system tree
        FileNode root = new FileNode("root");

        root.left = new FileNode("home");
        root.right = new FileNode("var");

        root.left.left = new FileNode("user");
        root.left.right = new FileNode("docs");

        root.right.right = new FileNode("log");

        root.left.left.left = new FileNode("config");

        // Output
        System.out.println("Preorder Traversal (Backup Order):");
        preorder(root);

        System.out.println("\n\nInorder Traversal (Alphabetical if BST):");
        inorder(root);

        System.out.println("\n\nPostorder Traversal (Safe Deletion):");
        postorder(root);
    }

}
