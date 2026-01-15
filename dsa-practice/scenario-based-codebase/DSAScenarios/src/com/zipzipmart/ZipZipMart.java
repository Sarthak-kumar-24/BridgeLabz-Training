package com.zipzipmart;

import java.util.Scanner;

/* ------------------------------------------------------
 * 
 * Class: ZipZipMart
 * Daily Sales Summary Report (Merge Sort)
 * 
 * Divide and conquer
 * Large-scale sorting
 * -----------------------------------------------------
 */
public class ZipZipMart {

	
    // Merge Sort method
    public static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    public static void merge(Transaction[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge while preserving stability
        while (i < n1 && j < n2) {
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {

                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copys remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Displays sorted transactions
    public static void displayTransactions(Transaction[] arr) {
        System.out.println("\nDaily Sales Summary (Sorted by Date → Amount):\n");
        for (Transaction t : arr) {
            System.out.println(
                "ID: " + t.id +
                " | Date: " + t.date +
                " | Amount: " + t.amount
            );
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        Transaction[] transactions = new Transaction[n];

        // User input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of transaction " + (i + 1));

            System.out.print("Transaction ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Amount: ");
            int amount = sc.nextInt();

            transactions[i] = new Transaction(id, date, amount);
        }

        // Sorting using Merge Sort
        mergeSort(transactions, 0, n - 1);

        // Displays result
        displayTransactions(transactions);

        sc.close();
    }
}
