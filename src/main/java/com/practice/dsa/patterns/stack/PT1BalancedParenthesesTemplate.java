package com.practice.dsa.patterns.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Beginner balanced-parentheses pattern.
 */
public class PT1BalancedParenthesesTemplate {
    public boolean isBalanced(String text) {
        Map<Character, Character> closeToOpen = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : text.toCharArray()) {
            if (closeToOpen.containsValue(ch)) {
                stack.push(ch);
            } else if (closeToOpen.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != closeToOpen.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
