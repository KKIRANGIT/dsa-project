package com.practice.dsa.problems.greedy.valid_parenthesis_string;

/**
 * LC 678 - Valid Parenthesis String
 *
 * Beginner idea:
 * '*' can behave like '(' or ')' or empty.
 * So we track a range:
 * low = smallest possible count of open brackets
 * high = largest possible count of open brackets
 */
public class LC678ValidParenthesisStringSolver {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else {
                low--;
                high++;
            }

            if (high < 0) {
                return false;
            }
            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }
}
