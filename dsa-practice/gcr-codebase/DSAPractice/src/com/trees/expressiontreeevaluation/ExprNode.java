package com.trees.expressiontreeevaluation;

/**
 * ExprNode represents a node in an Expression Tree.
 * Each node stores either:
 * - an operator (+, -, *, /)
 * - or an operand (number)
 */
public class ExprNode {
	
    protected String value;
    protected ExprNode left, right;

    ExprNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
