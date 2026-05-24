package com.practice.dsa.basics.graph;

import java.util.Arrays;

public class GridShortestPathBasicsMain {
    public static void main(String[] args) {
        // 0 = open cell, 1 = blocked cell.
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0}
        };

        GridShortestPathBasics basics = new GridShortestPathBasics();
        System.out.println("grid = " + Arrays.deepToString(grid));
        System.out.println("start = (0,0), target = (2,2)");
        System.out.println("shortest path = " + basics.shortestPath(grid));
    }
}
