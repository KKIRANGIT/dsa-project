package com.practice.dsa.problems.greedy.gas_station;

/**
 * LC 134 - Gas Station
 *
 * Beginner idea:
 * If total gas is less than total cost, the trip is impossible.
 * When the running tank becomes negative, the current start cannot work,
 * so the next station becomes the new candidate start.
 */
public class LC134GasStationSolver {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            total += gain;
            tank += gain;

            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }

        return total >= 0 ? start : -1;
    }
}
