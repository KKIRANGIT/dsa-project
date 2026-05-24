package com.practice.dsa.problems.dp1.maximum_product_subarray;

/**
 * LC 152 - Maximum Product Subarray
 *
 * Beginner idea:
 * A negative number can turn a large negative product into a large positive product.
 * So we track both the current maximum product and current minimum product.
 */
public class LC152MaximumProductSubarraySolver {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];

            if (value < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(value, currentMax * value);
            currentMin = Math.min(value, currentMin * value);
            answer = Math.max(answer, currentMax);
        }

        return answer;
    }
}
