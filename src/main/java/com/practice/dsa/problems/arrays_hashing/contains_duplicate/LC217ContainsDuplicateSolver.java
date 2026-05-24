package com.practice.dsa.problems.arrays_hashing.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 217 - Contains Duplicate
 *
 * Beginner idea:
 * A set stores only unique values.
 * If adding a value fails, that means the value already appeared before.
 */
public class LC217ContainsDuplicateSolver {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // add(...) returns false when the number is already present.
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}
