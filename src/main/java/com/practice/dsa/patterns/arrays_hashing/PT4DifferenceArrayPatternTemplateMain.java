package com.practice.dsa.patterns.arrays_hashing;

import java.util.Arrays;

public class PT4DifferenceArrayPatternTemplateMain {
    public static void main(String[] args) {
        PT4DifferenceArrayPatternTemplate template = new PT4DifferenceArrayPatternTemplate();
        int[][] updates = {
                {0, 2, 3},
                {1, 3, 2},
                {2, 4, -1}
        };
        System.out.println(Arrays.toString(template.applyUpdates(5, updates)));
    }
}
