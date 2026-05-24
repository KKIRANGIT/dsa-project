package com.practice.dsa.problems.backtracking;

import com.practice.dsa.problems.backtracking.combination_sum.LC39CombinationSumSolver;
import com.practice.dsa.problems.backtracking.permutations.LC46PermutationsSolver;
import com.practice.dsa.problems.backtracking.subsets.LC78SubsetsSolver;

public class BacktrackingProblemsMain {
    public static void main(String[] args) {
        // Run subsets sample.
        System.out.println("LC78 = " + new LC78SubsetsSolver().subsets(new int[]{1, 2}));
        // Run permutations sample.
        System.out.println("LC46 = " + new LC46PermutationsSolver().permute(new int[]{1, 2, 3}));
        // Run combination-sum sample.
        System.out.println("LC39 = " + new LC39CombinationSumSolver().combinationSum(new int[]{2, 3, 5}, 8));
    }
}
