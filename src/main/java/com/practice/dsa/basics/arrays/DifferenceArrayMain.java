package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class DifferenceArrayMain {
    public static void main(String[] args) {
        // Create helper object.
        DifferenceArray differenceArray = new DifferenceArray();
        // Each update means: add delta to every element from left to right.
        int[][] updates = {
                {0, 2, 3},
                {2, 4, 2},
                {1, 3, -1}
        };

        // Apply all range updates efficiently.
        int[] result = differenceArray.applyRangeUpdate(5, updates);
        // Final result after combining all updates should be easy to inspect in the debugger.
        // Print final array after all updates.
        System.out.println("result = " + Arrays.toString(result));
    }
}
