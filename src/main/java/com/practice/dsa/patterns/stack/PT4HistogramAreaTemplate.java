package com.practice.dsa.patterns.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Beginner histogram-area pattern.
 *
 * Use for largest-rectangle-in-histogram style questions.
 */
public class PT4HistogramAreaTemplate {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int best = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = i == heights.length ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int width = i - leftBoundary - 1;
                best = Math.max(best, height * width);
            }

            stack.push(i);
        }

        return best;
    }
}
