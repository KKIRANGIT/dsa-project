package com.practice.dsa.problems.advanced_graphs.connecting_cities_with_minimum_cost;

public class LC1135ConnectingCitiesWithMinimumCostMain {
    public static void main(String[] args) {
        int[][] connections = {
                {1, 2, 5},
                {1, 3, 6},
                {2, 3, 1}
        };

        System.out.println("LC1135 = " + new LC1135ConnectingCitiesWithMinimumCostSolver().minimumCost(3, connections));
    }
}
