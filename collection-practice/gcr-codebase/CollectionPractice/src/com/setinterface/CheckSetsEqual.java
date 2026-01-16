package com.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
=========================================================
Program: Check if Two Sets Are Equal
Purpose:
- Compare two sets
- Check whether both contain the same elements
- Order of elements does NOT matter
- Uses Set interface equals() method
=========================================================
*/
public class CheckSetsEqual {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first set
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Input second set
        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Check equality
        boolean isEqual = set1.equals(set2);

        System.out.println("Are both sets equal? " + isEqual);

        sc.close();
    }

}
