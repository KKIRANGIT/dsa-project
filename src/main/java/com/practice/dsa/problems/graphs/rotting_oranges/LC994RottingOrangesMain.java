package com.practice.dsa.problems.graphs.rotting_oranges;

public class LC994RottingOrangesMain {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println(new LC994RottingOrangesSolver().orangesRotting(grid));
    }
}
