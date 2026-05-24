package com.practice.dsa.problems.advanced_graphs.network_delay_time;

public class LC743NetworkDelayTimeMain {
    public static void main(String[] args) {
        // times[i] = {from, to, weight}
        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        // Print the time needed for the signal to reach all nodes.
        System.out.println(new LC743NetworkDelayTimeSolver().networkDelayTime(times, 4, 2));
    }
}
