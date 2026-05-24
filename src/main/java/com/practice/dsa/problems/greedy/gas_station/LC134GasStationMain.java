package com.practice.dsa.problems.greedy.gas_station;

public class LC134GasStationMain {
    public static void main(String[] args) {
        // Print the index of a valid start station.
        System.out.println(new LC134GasStationSolver().canCompleteCircuit(
                new int[]{1, 2, 3, 4, 5},
                new int[]{3, 4, 5, 1, 2}));
    }
}
