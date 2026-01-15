package com.trees.traversalapplication;

public class FileNode {
	
    protected String name;
    protected FileNode left, right;

    
    FileNode(String name) {
        this.name = name;
        left = right = null;
    }

}
