package com.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
=========================================================
Program: Find Subsets
Purpose:
- Check whether one set is a subset of another set
- Order of elements does NOT matter
- Uses Set interface method containsAll()
=========================================================
*/
public class FindSubset {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Set 1
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Input Set 2
        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Check subset
        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is Set1 a subset of Set2? " + isSubset);

        sc.close();
    }

}
