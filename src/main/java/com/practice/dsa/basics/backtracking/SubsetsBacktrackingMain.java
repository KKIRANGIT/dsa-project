package com.practice.dsa.basics.backtracking;

public class SubsetsBacktrackingMain {
    public static void main(String[] args) {
        SubsetsBacktracking solver = new SubsetsBacktracking();
        // Every choice is "take this number or skip it later".
        System.out.println("subsets = " + solver.subsets(new int[]{1, 2, 3}));
    }
}
