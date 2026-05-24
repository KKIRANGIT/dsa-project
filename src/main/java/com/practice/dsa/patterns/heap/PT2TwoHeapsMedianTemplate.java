package com.practice.dsa.patterns.heap;

import java.util.PriorityQueue;

/**
 * Beginner two-heaps median pattern.
 *
 * Use for running median problems.
 */
public class PT2TwoHeapsMedianTemplate {
    private final PriorityQueue<Integer> lower = new PriorityQueue<>((a, b) -> b - a);
    private final PriorityQueue<Integer> upper = new PriorityQueue<>();

    public void add(int value) {
        if (lower.isEmpty() || value <= lower.peek()) {
            lower.offer(value);
        } else {
            upper.offer(value);
        }

        if (lower.size() > upper.size() + 1) {
            upper.offer(lower.poll());
        } else if (upper.size() > lower.size()) {
            lower.offer(upper.poll());
        }
    }

    public double median() {
        if (lower.size() == upper.size()) {
            return (lower.peek() + upper.peek()) / 2.0;
        }
        return lower.peek();
    }
}
