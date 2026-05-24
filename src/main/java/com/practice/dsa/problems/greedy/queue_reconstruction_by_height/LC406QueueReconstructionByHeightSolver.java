package com.practice.dsa.problems.greedy.queue_reconstruction_by_height;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC 406 - Queue Reconstruction by Height
 *
 * Beginner idea:
 * Place taller people first because shorter people cannot affect how many taller-or-equal
 * people appear in front of them.
 */
public class LC406QueueReconstructionByHeightSolver {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (first, second) -> {
            if (first[0] != second[0]) {
                return Integer.compare(second[0], first[0]);
            }
            return Integer.compare(first[1], second[1]);
        });

        List<int[]> ordered = new ArrayList<>();
        for (int[] person : people) {
            ordered.add(person[1], person);
        }

        return ordered.toArray(new int[0][]);
    }
}
