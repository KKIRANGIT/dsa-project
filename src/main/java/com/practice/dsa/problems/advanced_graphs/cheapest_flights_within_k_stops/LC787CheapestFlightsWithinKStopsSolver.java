package com.practice.dsa.problems.advanced_graphs.cheapest_flights_within_k_stops;

import java.util.Arrays;

/**
 * LC 787 - Cheapest Flights Within K Stops
 *
 * Beginner idea:
 * Bellman-Ford style relaxation by number of edges used.
 */
public class LC787CheapestFlightsWithinKStopsSolver {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE / 4);
        distance[src] = 0;

        for (int round = 0; round <= k; round++) {
            int[] nextDistance = distance.clone();
            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];
                nextDistance[to] = Math.min(nextDistance[to], distance[from] + price);
            }
            distance = nextDistance;
        }

        return distance[dst] >= Integer.MAX_VALUE / 4 ? -1 : distance[dst];
    }
}
