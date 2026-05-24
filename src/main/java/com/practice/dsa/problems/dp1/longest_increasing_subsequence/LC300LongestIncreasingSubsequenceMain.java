package com.practice.dsa.problems.dp1.longest_increasing_subsequence;

public class LC300LongestIncreasingSubsequenceMain {
    public static void main(String[] args) {
        System.out.println(new LC300LongestIncreasingSubsequenceSolver().lengthOfLIS(
                new int[]{10, 9, 2, 5, 3, 7, 101, 18}
        ));
    }
}
