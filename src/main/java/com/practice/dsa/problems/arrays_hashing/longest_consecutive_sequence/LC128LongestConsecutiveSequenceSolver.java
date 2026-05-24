package com.practice.dsa.problems.arrays_hashing.longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 128 - Longest Consecutive Sequence
 *
 * Beginner idea:
 * Use a set for O(1) lookup.
 * Only start counting from numbers that are the beginning of a sequence.
 *
 * Example:
 * For 1,2,3,4 we only start from 1 because 0 does not exist.
 * We do not start from 2, 3, or 4 because they are not sequence starts.
 */
public class LC128LongestConsecutiveSequenceSolver {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }

        int best = 0;
        for (int num : values) {
            // If num - 1 exists, this number is in the middle of a sequence.
            if (values.contains(num - 1)) {
                continue;
            }

            // Count forward only from valid sequence starts.
            int length = 1;
            int current = num;
            while (values.contains(current + 1)) {
                current++;
                length++;
            }

            best = Math.max(best, length);
        }
        return best;
    }
}
