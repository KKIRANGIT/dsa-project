package com.practice.dsa.problems.graphs.pacific_atlantic_water_flow;

public class LC417PacificAtlanticWaterFlowMain {
    public static void main(String[] args) {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        System.out.println(new LC417PacificAtlanticWaterFlowSolver().pacificAtlantic(heights));
    }
}
