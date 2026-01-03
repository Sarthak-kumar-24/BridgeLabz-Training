package com.hashmap;

import java.util.*;

/**
 * Finds all sub-arrays with zero sum.
 */
public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // Map: prefixSum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // To handle subarray starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        int j=1;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If same sum seen before, zero-sum subarray exists
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                        "Zero-sum subarray: "+ (j++) +" [" + (startIndex + 1) + " to " + i + "]"
                    );
                }
            }

            // Store current index
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
            /*
             if (!map.containsKey(sum)) {
                     map.put(sum, new ArrayList<>());
             }
              map.get(sum).add(i);
             
             */
        }
    }

    /* ================= DEMO ================= */
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, -4};

        findZeroSumSubarrays(arr);
    }
}
