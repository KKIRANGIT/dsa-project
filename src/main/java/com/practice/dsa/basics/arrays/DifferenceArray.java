package com.practice.dsa.basics.arrays;

/**
 * Beginner difference array reference.
 *
 * Instead of updating every element in a range directly,
 * we mark only the start and the position after the end.
 * A final prefix walk reconstructs the real values.
 *
 * Beginner mental model:
 * diff does not store the real array values.
 * It stores only where a running addition should start and stop.
 */
public class DifferenceArray {
    public int[] applyRangeUpdate(int length, int[][] updates) {
        // diff holds boundary changes only.
        int[] diff = new int[length];

        for (int[] update : updates) {
            // Range start.
            int left = update[0];
            // Range end.
            int right = update[1];
            // Value to add across the whole range.
            int delta = update[2];

            // Start adding delta from left onward.
            diff[left] += delta;
            // Stop adding delta immediately after right.
            if (right + 1 < length) {
                diff[right + 1] -= delta;
            }
        }

        // Convert difference array back into actual values.
        int[] result = new int[length];
        // running accumulates the current active total.
        int running = 0;
        for (int i = 0; i < length; i++) {
            running += diff[i];
            result[i] = running;
        }

        // Return final updated array.
        return result;
    }
}
