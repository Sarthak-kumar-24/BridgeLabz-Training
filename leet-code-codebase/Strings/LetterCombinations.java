/*
problem : Letter combination of numbers

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = "2"
Output: ["a","b","c"]





*/


import java.util.*;

class LetterCombinations {
    private void solve( String digits, StringBuilder output, int i, List<String> ans, String[] mapping) {

        // Base case: all digits processed
        if (i >= digits.length()) {
            ans.add(output.toString());
            return;
        }

        int num = digits.charAt(i) - '0';
        String value = mapping[num];

        for (int j = 0; j < value.length(); j++) {
            // choose
            output.append(value.charAt(j));

            // explore
            solve(digits, output, i + 1, ans, mapping);

            // un-choose (backtrack)
            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

       
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] mapping = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(digits, new StringBuilder(), 0, ans, mapping);
        return ans;

    }
}
