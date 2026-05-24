package com.practice.dsa.problems.greedy.queue_reconstruction_by_height;

import java.util.Arrays;

public class LC406QueueReconstructionByHeightMain {
    public static void main(String[] args) {
        int[][] people = {
                {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}
        };

        System.out.println("LC406 = " + Arrays.deepToString(new LC406QueueReconstructionByHeightSolver().reconstructQueue(people)));
    }
}
