package com.trees.constructionandvalidation;

public class BSTNode {
	
    protected int key;
    protected BSTNode left, right;

    BSTNode(int key) {
        this.key = key;
        left = right = null;
    }

}
