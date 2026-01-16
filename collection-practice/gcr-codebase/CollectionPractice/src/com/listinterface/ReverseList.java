package com.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*
 =========================================================
 Program: Reverse a List

 - Reverse elements of a list without using built-in methods
 - Implemented for both ArrayList and LinkedList
 - Uses manual swapping logic
 =========================================================
*/
public class ReverseList {
	
    // Reverse ArrayList manually
    private static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Reverse LinkedList manually
    private static void reverseLinkedList(LinkedList<Integer> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arrayList.add(val);
            linkedList.add(val);
        }

        // Reverse both lists
        reverseArrayList(arrayList);
        reverseLinkedList(linkedList);

        // Output
        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);

        sc.close();
    }

}
