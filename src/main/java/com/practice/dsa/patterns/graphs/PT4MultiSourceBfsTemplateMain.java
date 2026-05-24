package com.practice.dsa.patterns.graphs;

import java.util.Arrays;

public class PT4MultiSourceBfsTemplateMain {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        };
        PT4MultiSourceBfsTemplate template = new PT4MultiSourceBfsTemplate();
        System.out.println(Arrays.deepToString(template.distanceFromSources(grid)));
    }
}
