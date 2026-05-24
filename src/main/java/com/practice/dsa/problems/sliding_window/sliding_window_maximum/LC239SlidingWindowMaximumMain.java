package com.practice.dsa.problems.sliding_window.sliding_window_maximum;

import java.util.Arrays;

public class LC239SlidingWindowMaximumMain {
    public static void main(String[] args) {
        // Create solver object.
        LC239SlidingWindowMaximumSolver solver = new LC239SlidingWindowMaximumSolver();
        // Print the maximum value from each window of size 3.
        System.out.println(Arrays.toString(solver.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
