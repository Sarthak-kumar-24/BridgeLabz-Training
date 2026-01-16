package com.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
=========================================================
Program: Symmetric Difference of Two Sets
Purpose:
- Find elements that are present in either set
  but NOT present in both
- Uses Set operations (addAll, retainAll, removeAll)
=========================================================
*/
public class SymmetricDifference {
	
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

        // Copy of sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Symmetric Difference = Union - Intersection
        union.removeAll(intersection);

        // Output
        System.out.println("Symmetric Difference: " + union);

        sc.close();
    }

}
