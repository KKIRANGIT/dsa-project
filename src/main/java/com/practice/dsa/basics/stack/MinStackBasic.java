package com.practice.dsa.basics.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Beginner min stack reference.
 *
 * values stack stores everything.
 * mins stack stores the smallest values seen so far.
 */
public class MinStackBasic {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> mins = new ArrayDeque<>();

    public void push(int value) {
        // Push value into normal stack.
        values.push(value);
        // Also push into mins when it becomes the smallest so far.
        if (mins.isEmpty() || value <= mins.peek()) {
            mins.push(value);
        }
    }

    public int pop() {
        // Remove top value from main stack.
        int removed = values.pop();
        // If it was also the minimum, remove from mins stack too.
        if (removed == mins.peek()) {
            mins.pop();
        }
        return removed;
    }

    public int getMin() {
        // Current minimum is on top of mins stack.
        return mins.peek();
    }
}
