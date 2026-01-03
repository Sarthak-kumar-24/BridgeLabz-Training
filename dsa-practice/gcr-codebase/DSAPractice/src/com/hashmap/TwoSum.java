package com.hashmap;

import java.util.HashMap;

/**
 * Two Sum Problem using HashMap.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // value -> index

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            // Check if required value already exists
            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            // Store current value with its index
            map.put(nums[i], i);
        }

        // If no solution exists
        return new int[] {-1, -1};
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(
            "Indices: [" + result[0] + ", " + result[1] + "]"
        );
    }
}

