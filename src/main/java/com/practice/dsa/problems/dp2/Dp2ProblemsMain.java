package com.practice.dsa.problems.dp2;

import com.practice.dsa.problems.dp2.coin_change_ii.LC518CoinChangeIISolver;
import com.practice.dsa.problems.dp2.distinct_subsequences.LC115DistinctSubsequencesSolver;
import com.practice.dsa.problems.dp2.edit_distance.LC72EditDistanceSolver;
import com.practice.dsa.problems.dp2.interleaving_string.LC97InterleavingStringSolver;
import com.practice.dsa.problems.dp2.longest_common_subsequence.LC1143LongestCommonSubsequenceSolver;
import com.practice.dsa.problems.dp2.maximal_square.LC221MaximalSquareSolver;
import com.practice.dsa.problems.dp2.minimum_path_sum.LC64MinimumPathSumSolver;
import com.practice.dsa.problems.dp2.unique_paths.LC62UniquePathsSolver;
import com.practice.dsa.problems.dp2.unique_paths_ii.LC63UniquePathsIISolver;

public class Dp2ProblemsMain {
    public static void main(String[] args) {
        // Run unique-paths sample.
        System.out.println("LC62   = " + new LC62UniquePathsSolver().uniquePaths(3, 7));
        // Run longest-common-subsequence sample.
        System.out.println("LC1143 = " + new LC1143LongestCommonSubsequenceSolver().longestCommonSubsequence("abcde", "ace"));
        // Run edit-distance sample.
        System.out.println("LC72   = " + new LC72EditDistanceSolver().minDistance("horse", "ros"));
        // Run interleaving-string sample.
        System.out.println("LC97   = " + new LC97InterleavingStringSolver().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        // Run distinct-subsequences sample.
        System.out.println("LC115  = " + new LC115DistinctSubsequencesSolver().numDistinct("rabbbit", "rabbit"));
        // Run minimum-path-sum sample.
        System.out.println("LC64   = " + new LC64MinimumPathSumSolver().minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }));
        // Run coin-change-ii sample.
        System.out.println("LC518  = " + new LC518CoinChangeIISolver().change(5, new int[]{1, 2, 5}));
        // Run unique-paths-ii sample.
        System.out.println("LC63   = " + new LC63UniquePathsIISolver().uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
        // Run maximal-square sample.
        System.out.println("LC221  = " + new LC221MaximalSquareSolver().maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
    }
}
