package com.practice.dsa.problems.stack.valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * LC 20 - Valid Parentheses
 *
 * Beginner idea:
 * An opening bracket starts unfinished work.
 * A closing bracket must match the most recent unfinished opening bracket.
 *
 * That "most recent unfinished item" behavior is exactly what a stack does.
 */
public class LC20ValidParenthesesSolver {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (pairs.containsValue(ch)) {
                // Opening brackets wait for a future closing bracket.
                stack.push(ch);
                continue;
            }

            if (pairs.containsKey(ch)) {
                // A closing bracket must match the latest opening bracket.
                if (stack.isEmpty() || stack.pop() != pairs.get(ch)) {
                    return false;
                }
            }
        }

        // All openings must be matched by the end.
        return stack.isEmpty();
    }
}
