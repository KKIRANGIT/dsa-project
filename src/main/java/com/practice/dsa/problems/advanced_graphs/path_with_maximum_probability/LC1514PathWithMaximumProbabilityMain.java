package com.practice.dsa.problems.advanced_graphs.path_with_maximum_probability;

public class LC1514PathWithMaximumProbabilityMain {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1}, {1, 2}, {0, 2}
        };
        double[] probabilities = {0.5, 0.5, 0.2};

        System.out.println("LC1514 = " + new LC1514PathWithMaximumProbabilitySolver().maxProbability(
                3, edges, probabilities, 0, 2));
    }
}
