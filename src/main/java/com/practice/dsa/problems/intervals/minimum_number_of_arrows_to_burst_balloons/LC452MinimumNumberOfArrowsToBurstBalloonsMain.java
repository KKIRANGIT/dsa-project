package com.practice.dsa.problems.intervals.minimum_number_of_arrows_to_burst_balloons;

public class LC452MinimumNumberOfArrowsToBurstBalloonsMain {
    public static void main(String[] args) {
        System.out.println(new LC452MinimumNumberOfArrowsToBurstBalloonsSolver().findMinArrowShots(
                new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}
        ));
    }
}
