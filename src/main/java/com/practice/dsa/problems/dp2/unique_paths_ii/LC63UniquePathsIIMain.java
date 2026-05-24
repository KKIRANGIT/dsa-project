package com.practice.dsa.problems.dp2.unique_paths_ii;

public class LC63UniquePathsIIMain {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        System.out.println("LC63 = " + new LC63UniquePathsIISolver().uniquePathsWithObstacles(obstacleGrid));
    }
}
