package com.practice.dsa.problems.binary_search.koko_eating_bananas;

public class LC875KokoEatingBananasMain {
    public static void main(String[] args) {
        // Create solver object.
        LC875KokoEatingBananasSolver solver = new LC875KokoEatingBananasSolver();
        // Print the minimum eating speed needed to finish in time.
        System.out.println(solver.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
