package com.practice.dsa.problems.advanced_graphs.path_with_minimum_effort;

public class LC1631PathWithMinimumEffortMain {
    public static void main(String[] args) {
        int[][] heights = {
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        };

        System.out.println("LC1631 = " + new LC1631PathWithMinimumEffortSolver().minimumEffortPath(heights));
    }
}
