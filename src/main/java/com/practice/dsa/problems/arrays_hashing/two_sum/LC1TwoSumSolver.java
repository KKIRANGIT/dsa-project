package com.practice.dsa.problems.arrays_hashing.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1 - Two Sum
 *
 * Beginner idea:
 * We walk through the array once.
 * For the current number, we ask:
 * "What value do I need to reach the target?"
 *
 * If that needed value was already seen earlier, we have found the answer.
 * If not, we store the current value so future numbers can pair with it.
 */
public class LC1TwoSumSolver {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            // If the missing partner already exists in the map,
            // return the earlier index and the current index.
            if (indexByValue.containsKey(needed)) {
                return new int[]{indexByValue.get(needed), i};
            }

            // Store the current number after the check.
            // This avoids using the same element twice in one pair.
            indexByValue.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
