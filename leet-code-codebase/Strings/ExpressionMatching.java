/*
Problem: Regular Expression matching

Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".




*/


class ExpressionMatching {

    public boolean matching(int i, int j, String s, String p) {
        // Base case 1: both string and pattern finished
        if (i >= s.length() && j >= p.length()) {
            return true;
        }

        // Base case 2: pattern finished but string not finished
        if (j >= p.length()) {
            return false;
        }

        // Check if current characters match
        boolean currMatch = (i < s.length()) &&
                (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j));

        // Handle '*' case
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Option 1: Skip x*
            boolean ex = matching(i, j + 2, s, p);

            // Option 2: Consume one character if match
            boolean inc = currMatch && matching(i + 1, j, s, p);

            return ex || inc;
        }

        // Normal character match (no '*')
        else if (currMatch) {
            return matching(i + 1, j + 1, s, p);
        }

        // No match
        else {
            return false;
        }

    }

    public boolean isMatch(String s, String p) {
        return matching(0,0,s,p);

    }
}