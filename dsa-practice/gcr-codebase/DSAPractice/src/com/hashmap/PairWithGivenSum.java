package com.hashmap;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {

            int required = target - num;

            if (seen.contains(required)) {
                System.out.println("Pair found: " + required + " + " + num);
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    /* ================= DEMO ================= */
    public static void main(String[] args) {

        int[] arr = {8, 4, 1, 6, 2};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}
