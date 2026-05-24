package com.practice.dsa.problems.greedy.merge_triplets_to_form_target_triplet;

public class LC1899MergeTripletsToFormTargetTripletMain {
    public static void main(String[] args) {
        int[][] triplets = {
                {2, 5, 3},
                {1, 8, 4},
                {1, 7, 5}
        };
        int[] target = {2, 7, 5};

        System.out.println("LC1899 = " + new LC1899MergeTripletsToFormTargetTripletSolver().mergeTriplets(triplets, target));
    }
}
