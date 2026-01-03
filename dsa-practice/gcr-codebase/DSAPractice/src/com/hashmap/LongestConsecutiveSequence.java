package com.hashmap;

import java.util.HashMap;

public class LongestConsecutiveSequence {
	
	  public static int longestConsecutive(int[] nums) {
	  
	  HashMap<Integer, Integer> map = new HashMap<>(); 
	  int longest = 0;
	  
	  for (int num : nums) {
	  
	  // skip duplicates 
	  if (map.containsKey(num)) { 
	  continue; 
	  }
	  
	  int left = map.getOrDefault(num - 1, 0); 
	  int right = map.getOrDefault(num + 1, 0);
	  
	  int currentLength = left + right + 1;
	  
	  // update current number 
	  map.put(num, currentLength);
	  
	  // update sequence boundaries 
	  //map.put(num - left, currentLength); 
	  //map.put(num + right, currentLength);
	  
	  longest = Math.max(longest, currentLength); 
	  }
	  
	  return longest; 
	  }
	 
	/*
	public static int longestConsecutive(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		// store all numbers
		for (int num : nums) {
			map.put(num, true);
		}

		int longest = 0;

		// find sequence starts
		for (int num : nums) {

			if (!map.containsKey(num - 1)) {

				int current = num;
				int count = 1;

				while (map.containsKey(current + 1)) {
					current++;
					count++;
				}

				longest = Math.max(longest, count);
			}
		}
		return longest;
	}
*/
	public static void main(String[] args) {
		int[] nums = { 100, 4, 0, 1, 3, 2 };
		System.out.println(longestConsecutive(nums)); // 4
	}
}
