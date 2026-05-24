package com.practice.dsa.patterns.arrays_hashing;

/**
 * Beginner difference-array pattern.
 *
 * Use this when many range updates happen on an array.
 * Instead of updating every element directly, update only boundaries.
 */
public class PT4DifferenceArrayPatternTemplate {
    public int[] applyUpdates(int length, int[][] updates) {
        int[] diff = new int[length];

        for (int[] update : updates) {
            int left = update[0];
            int right = update[1];
            int delta = update[2];

            diff[left] += delta;
            if (right + 1 < length) {
                diff[right + 1] -= delta;
            }
        }

        int[] result = new int[length];
        int running = 0;
        for (int i = 0; i < length; i++) {
            running += diff[i];
            result[i] = running;
        }

        return result;
    }
}
