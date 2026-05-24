package com.practice.dsa.patterns.dp;

public class PT2OneDimensionalDpTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT2OneDimensionalDpTemplate template = new PT2OneDimensionalDpTemplate();
        // Print minimum cost to reach the top.
        System.out.println(template.minCostClimbingStairs(new int[]{10, 15, 20}));
    }
}
