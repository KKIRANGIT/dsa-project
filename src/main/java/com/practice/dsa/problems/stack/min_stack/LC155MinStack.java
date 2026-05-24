package com.practice.dsa.problems.stack.min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LC 155 - Min Stack
 *
 * Beginner idea:
 * One stack stores all values.
 * Another stack stores the running minimums.
 *
 * Whenever a new value becomes the smallest so far,
 * we also push it to the mins stack.
 */
public class LC155MinStack {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> mins = new ArrayDeque<>();

    public void push(int val) {
        values.push(val);
        if (mins.isEmpty() || val <= mins.peek()) {
            mins.push(val);
        }
    }

    public void pop() {
        int removed = values.pop();
        // If the removed value was also the current minimum,
        // remove it from the mins stack too.
        if (removed == mins.peek()) {
            mins.pop();
        }
    }

    public int top() {
        return values.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
