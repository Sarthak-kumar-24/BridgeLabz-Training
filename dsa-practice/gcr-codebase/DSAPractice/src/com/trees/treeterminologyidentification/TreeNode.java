package com.trees.treeterminologyidentification;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
    protected String name;
    protected List<TreeNode> children;

    
    TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

}
