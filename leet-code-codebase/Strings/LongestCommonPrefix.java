/*
Problem: Longest commong Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.



*/


public class LongestCommonPrefix{

    public String longestCommonPrefix(String[] strs) {

        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";
        int i = 0;

        // Loop over characters of the first string
        while (i < strs[0].length()) {

            // Compare this character with all strings
            for (int j = 0; j < strs.length; j++) {

                // If any string is shorter OR char mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return prefix;
                }
            }

            // All strings matched at index i
            prefix += strs[0].charAt(i);
            i++;
        }

        return prefix;
    }
}
