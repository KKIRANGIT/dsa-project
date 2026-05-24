package com.practice.dsa.problems.greedy.merge_triplets_to_form_target_triplet;

/**
 * LC 1899 - Merge Triplets to Form Target Triplet
 *
 * Beginner idea:
 * Ignore any triplet that exceeds the target in any position.
 * Among the remaining triplets, check whether we can match each target position.
 */
public class LC1899MergeTripletsToFormTargetTripletSolver {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean first = false;
        boolean second = false;
        boolean third = false;

        for (int[] triplet : triplets) {
            if (triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) {
                continue;
            }
            if (triplet[0] == target[0]) {
                first = true;
            }
            if (triplet[1] == target[1]) {
                second = true;
            }
            if (triplet[2] == target[2]) {
                third = true;
            }
        }

        return first && second && third;
    }
}
