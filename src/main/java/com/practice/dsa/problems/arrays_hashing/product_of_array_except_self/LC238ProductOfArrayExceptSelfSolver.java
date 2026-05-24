package com.practice.dsa.problems.arrays_hashing.product_of_array_except_self;

import java.util.Arrays;

/**
 * LC 238 - Product of Array Except Self
 *
 * Beginner idea:
 * For each index, answer[i] should be:
 * product of everything on the left
 * multiplied by
 * product of everything on the right
 *
 * We build the left product first, then multiply by the right product.
 */
public class LC238ProductOfArrayExceptSelfSolver {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            // At this moment, prefix is the product of all values before i.
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // Multiply by product of all values after i.
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
