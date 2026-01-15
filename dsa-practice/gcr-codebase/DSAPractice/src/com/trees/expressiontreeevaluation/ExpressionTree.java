package com.trees.expressiontreeevaluation;

/**
 * ExpressionTree class demonstrates:
 * - inorder, preorder, postorder traversals
 * - evaluation of expression tree using recursion
 */
public class ExpressionTree {
	
    static void inorder(ExprNode node) {
        if (node == null) return;

        if (node.left != null) System.out.print("(");
        inorder(node.left);
        System.out.print(node.value);
        inorder(node.right);
        if (node.right != null) System.out.print(")");
    }

    /**
     * Preorder traversal
     * Produces prefix notation
     */
    static void preorder(ExprNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    /**
     * Postorder traversal
     * Produces postfix notation
     */
    static void postorder(ExprNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    /**
     * Evaluates the expression tree using postorder logic
     */
    static int evaluate(ExprNode node) {
        if (node.left == null && node.right == null)
            return Integer.parseInt(node.value);

        int leftVal = evaluate(node.left);
        int rightVal = evaluate(node.right);

        switch (node.value) {
            case "+": return leftVal + rightVal;
            case "-": return leftVal - rightVal;
            case "*": return leftVal * rightVal;
            case "/": return leftVal / rightVal;
        }
        return 0;
    }

    public static void main(String[] args) {

        // Building expression tree for (3 + 5) * (8 - 2)
        ExprNode root = new ExprNode("*");
        root.left = new ExprNode("+");
        root.right = new ExprNode("-");

        root.left.left = new ExprNode("3");
        root.left.right = new ExprNode("5");

        root.right.left = new ExprNode("8");
        root.right.right = new ExprNode("2");

        System.out.print("Inorder (Infix): ");
        inorder(root);

        System.out.print("\nPreorder (Prefix): ");
        preorder(root);

        System.out.print("\nPostorder (Postfix): ");
        postorder(root);

        System.out.println("\n\nEvaluated Result: " + evaluate(root));
    }

}
