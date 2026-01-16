package com.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
=========================================================
Program: Convert a Set to a Sorted List
Purpose:
- Convert a HashSet of integers into a List
- Sort the list in ascending order
=========================================================
*/
public class SetToSortedList {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input set size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Convert Set to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort list in ascending order
        Collections.sort(sortedList);

        // Output
        System.out.println("Sorted List: " + sortedList);

        sc.close();
    }

}
