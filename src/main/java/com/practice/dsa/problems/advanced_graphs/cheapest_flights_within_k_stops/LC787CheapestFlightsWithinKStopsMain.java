package com.practice.dsa.problems.advanced_graphs.cheapest_flights_within_k_stops;

public class LC787CheapestFlightsWithinKStopsMain {
    public static void main(String[] args) {
        int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        System.out.println(new LC787CheapestFlightsWithinKStopsSolver().findCheapestPrice(3, flights, 0, 2, 1));
    }
}
