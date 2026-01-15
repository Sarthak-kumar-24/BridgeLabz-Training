package com.trees.constructionandvalidation;

/* -----------------------------------------------
 * 
 * A library management system needs to maintain books sorted by their ISBN numbers
 * The following ISBN numbers are to be inserted into a BST in the given order:
 * 50, 30, 70, 20, 40, 60, 80, 10, 25.
 * 
 * ------------------------------------------------
 */
public class LibraryBST {
	
	   // Insert into BST
    public static BSTNode insert(BSTNode root, int key) {
        if (root == null)
            return new BSTNode(key);

        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder traversal
    public static void inorder(BSTNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // Search with comparison trace
    public static void search(BSTNode root, int key) {
        System.out.print("Search path: ");
        while (root != null) {
            System.out.print(root.key + " ");
            if (key == root.key) {
                System.out.println("\nISBN Found!");
                return;
            }
            root = (key < root.key) ? root.left : root.right;
        }
        System.out.println("\nISBN Not Found!");
    }

    // Validate BST
    static boolean isValidBST(BSTNode root, int min, int max) {
        if (root == null) return true;

        if (root.key <= min || root.key >= max)
            return false;

        return isValidBST(root.left, min, root.key) &&
               isValidBST(root.right, root.key, max);
    }

    public static void main(String[] args) {

        int[] isbn = {50, 30, 70, 20, 40, 60, 80, 10, 25};

        BSTNode root = null;
        for (int x : isbn)
            root = insert(root, x);

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println("\n");
        search(root, 25);

        System.out.println("\nIs valid BST? " +
            isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}
