package com.practice.dsa.problems.dp1.partition_equal_subset_sum;

/**
 * LC 416 - Partition Equal Subset Sum
 *
 * Beginner idea:
 * If the total sum is even, the problem becomes:
 * can we choose some numbers whose sum is exactly total / 2?
 */
public class LC416PartitionEqualSubsetSumSolver {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int sum = target; sum >= num; sum--) {
                dp[sum] = dp[sum] || dp[sum - num];
            }
        }

        return dp[target];
    }
}
