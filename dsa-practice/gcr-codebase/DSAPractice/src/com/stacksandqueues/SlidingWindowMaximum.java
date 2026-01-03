package com.stacksandqueues;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Sliding Window Maximum using Deque.
 */
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>(); // stores indices
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            //  Remove indices out of window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            //  Remove smaller elements from back
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            //  Add current index
            deque.offerLast(i);

            //  Add maximum to result
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
