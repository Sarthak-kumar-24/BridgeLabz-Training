package com.trees.treeterminologyidentification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* -------------------------------------------
 * 
 * Tree Terminology Identification
 * 
 * a) Identify all leaf nodes in this organizational tree.
 * b) What is the height of the tree?
 * c) What is the depth of “Dev Lead”?
 * d) List all ancestors of “Dev1”.
 * e) What is the degree of the CTO node?
 * 
 * ------------------------------------------
 */
public class CompanyOrgTree {
	
    // finds leaf nodes
    public static void findLeafNodes(TreeNode node, List<String> leaves) {
        if (node.children.isEmpty()) {
            leaves.add(node.name);
            return;
        }
        
        for (TreeNode child : node.children) {
            findLeafNodes(child, leaves);
        }
    }

    // Function to calculate height of tree
    public static int height(TreeNode node) {
        if (node == null) return -1;

        int maxHeight = -1;
        for (TreeNode child : node.children) {
            maxHeight = Math.max(maxHeight, height(child));
        }
        return maxHeight + 1;
        
    }

    // Function to find depth of a given node
    public static int findDepth(TreeNode node, String target, int depth) {
        if (node.name.equals(target)) {
            return depth;
        }
        for (TreeNode child : node.children) {
            int result = findDepth(child, target, depth + 1);
            if (result != -1)
                return result;
        }
        return -1;
    }

    // Function to find ancestors of a given node
    public static boolean findAncestors(TreeNode node, String target, List<String> ancestors) {
        if (node.name.equals(target))
            return true;

        for (TreeNode child : node.children) {
            if (findAncestors(child, target, ancestors)) {
                ancestors.add(node.name);
                
                return true;
            }
        }
        return false;
    }

    // Function to find degree of a node
    public static int findDegree(TreeNode node, String target) {
        if (node.name.equals(target)) {
            return node.children.size();
        }
        for (TreeNode child : node.children) {
            int result = findDegree(child, target);
            if (result != -1)
                return result;
        }
        return -1;
    }

    public static void main(String[] args) {

        // Building the organizational tree
        TreeNode CEO = new TreeNode("CEO");
        TreeNode CTO = new TreeNode("CTO");
        TreeNode CFO = new TreeNode("CFO");
        TreeNode DevLead = new TreeNode("Dev Lead");
        TreeNode HR = new TreeNode("HR");
        TreeNode Dev1 = new TreeNode("Dev1");
        TreeNode Dev2 = new TreeNode("Dev2");

        CEO.children.add(CTO);
        CEO.children.add(CFO);

        CTO.children.add(DevLead);
        CFO.children.add(HR);

        DevLead.children.add(Dev1);
        DevLead.children.add(Dev2);

        // Leaf Nodes
        List<String> leafNodes = new ArrayList<>();
        findLeafNodes(CEO, leafNodes);

        // Height of tree
        int treeHeight = height(CEO);

        // Depth of Dev Lead
        int devLeadDepth = findDepth(CEO, "Dev Lead", 0);

        // Ancestors of Dev1
        List<String> ancestors = new ArrayList<>();
        findAncestors(CEO, "Dev1", ancestors);
        Collections.reverse(ancestors);

        // Degree of CTO
        int ctoDegree = findDegree(CEO, "CTO");

        // Output
        System.out.println("---- Company Organizational Tree Analysis ----\n");

        System.out.println("Leaf Nodes: " + leafNodes);
        System.out.println("Height of Tree: " + treeHeight);
        System.out.println("Depth of Dev Lead: " + devLeadDepth);
        System.out.println("Ancestors of Dev1: " + ancestors);
        System.out.println("Degree of CTO: " + ctoDegree);
    }

}
