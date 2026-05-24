package com.practice.dsa.problems.dp1;

import com.practice.dsa.problems.dp1.climbing_stairs.LC70ClimbingStairsSolver;
import com.practice.dsa.problems.dp1.coin_change.LC322CoinChangeSolver;
import com.practice.dsa.problems.dp1.decode_ways.LC91DecodeWaysSolver;
import com.practice.dsa.problems.dp1.house_robber.LC198HouseRobberSolver;
import com.practice.dsa.problems.dp1.longest_increasing_subsequence.LC300LongestIncreasingSubsequenceSolver;
import com.practice.dsa.problems.dp1.maximum_product_subarray.LC152MaximumProductSubarraySolver;
import com.practice.dsa.problems.dp1.min_cost_climbing_stairs.LC746MinCostClimbingStairsSolver;
import com.practice.dsa.problems.dp1.partition_equal_subset_sum.LC416PartitionEqualSubsetSumSolver;
import com.practice.dsa.problems.dp1.word_break.LC139WordBreakSolver;

import java.util.List;

public class Dp1ProblemsMain {
    public static void main(String[] args) {
        // Run climbing-stairs sample.
        System.out.println("LC70  = " + new LC70ClimbingStairsSolver().climbStairs(5));
        // Run house-robber sample.
        System.out.println("LC198 = " + new LC198HouseRobberSolver().rob(new int[]{2, 7, 9, 3, 1}));
        // Run coin-change sample.
        System.out.println("LC322 = " + new LC322CoinChangeSolver().coinChange(new int[]{1, 2, 5}, 11));
        // Run word-break sample.
        System.out.println("LC139 = " + new LC139WordBreakSolver().wordBreak("leetcode", List.of("leet", "code")));
        // Run LIS sample.
        System.out.println("LC300 = " + new LC300LongestIncreasingSubsequenceSolver().lengthOfLIS(
                new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        // Run decode-ways sample.
        System.out.println("LC91  = " + new LC91DecodeWaysSolver().numDecodings("226"));
        // Run maximum-product-subarray sample.
        System.out.println("LC152 = " + new LC152MaximumProductSubarraySolver().maxProduct(new int[]{2, 3, -2, 4}));
        // Run min-cost-climbing-stairs sample.
        System.out.println("LC746 = " + new LC746MinCostClimbingStairsSolver().minCostClimbingStairs(new int[]{10, 15, 20}));
        // Run partition-equal-subset-sum sample.
        System.out.println("LC416 = " + new LC416PartitionEqualSubsetSumSolver().canPartition(new int[]{1, 5, 11, 5}));
    }
}
