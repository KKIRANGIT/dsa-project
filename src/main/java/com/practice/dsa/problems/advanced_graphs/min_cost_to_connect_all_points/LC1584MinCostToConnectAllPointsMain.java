package com.practice.dsa.problems.advanced_graphs.min_cost_to_connect_all_points;

public class LC1584MinCostToConnectAllPointsMain {
    public static void main(String[] args) {
        int[][] points = {
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        };
        System.out.println(new LC1584MinCostToConnectAllPointsSolver().minCostConnectPoints(points));
    }
}
