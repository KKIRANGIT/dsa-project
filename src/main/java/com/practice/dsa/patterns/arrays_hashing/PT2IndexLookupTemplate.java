package com.practice.dsa.patterns.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Beginner index-lookup pattern.
 *
 * Use this when you need fast complement or previous-position lookup.
 */
public class PT2IndexLookupTemplate {
    public int[] findPairSum(int[] nums, int target) {
        Map<Integer, Integer> seenIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (seenIndex.containsKey(needed)) {
                return new int[]{seenIndex.get(needed), i};
            }
            seenIndex.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
