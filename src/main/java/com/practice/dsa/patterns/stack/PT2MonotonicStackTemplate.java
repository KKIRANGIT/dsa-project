package com.practice.dsa.patterns.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Beginner monotonic-stack pattern.
 *
 * Stack stores indexes.
 * Values at those indexes stay in monotonic order.
 *
 * This example finds next greater elements.
 */
public class PT2MonotonicStackTemplate {
    public int[] nextGreaterElements(int[] nums) {
        // Default answer is -1 when no greater element exists.
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        // Stack holds indexes waiting for a greater value.
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Current value resolves smaller values waiting on stack.
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            // Current index now waits for its own next greater value.
            stack.push(i);
        }

        return result;
    }
}
