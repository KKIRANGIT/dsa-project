package com.practice.dsa.problems.advanced_graphs.swim_in_rising_water;

public class LC778SwimInRisingWaterMain {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 2},
                {1, 3}
        };

        System.out.println("LC778 = " + new LC778SwimInRisingWaterSolver().swimInWater(grid));
    }
}
