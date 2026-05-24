package com.practice.dsa.problems.dp2.minimum_path_sum;

public class LC64MinimumPathSumMain {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println("LC64 = " + new LC64MinimumPathSumSolver().minPathSum(grid));
    }
}
