package com.practice.dsa.problems.advanced_graphs;

import com.practice.dsa.problems.advanced_graphs.alien_dictionary.LC269AlienDictionarySolver;
import com.practice.dsa.problems.advanced_graphs.connecting_cities_with_minimum_cost.LC1135ConnectingCitiesWithMinimumCostSolver;
import com.practice.dsa.problems.advanced_graphs.cheapest_flights_within_k_stops.LC787CheapestFlightsWithinKStopsSolver;
import com.practice.dsa.problems.advanced_graphs.min_cost_to_connect_all_points.LC1584MinCostToConnectAllPointsSolver;
import com.practice.dsa.problems.advanced_graphs.network_delay_time.LC743NetworkDelayTimeSolver;
import com.practice.dsa.problems.advanced_graphs.path_with_minimum_effort.LC1631PathWithMinimumEffortSolver;
import com.practice.dsa.problems.advanced_graphs.path_with_maximum_probability.LC1514PathWithMaximumProbabilitySolver;
import com.practice.dsa.problems.advanced_graphs.redundant_connection.LC684RedundantConnectionSolver;
import com.practice.dsa.problems.advanced_graphs.reconstruct_itinerary.LC332ReconstructItinerarySolver;
import com.practice.dsa.problems.advanced_graphs.swim_in_rising_water.LC778SwimInRisingWaterSolver;

import java.util.Arrays;

public class AdvancedGraphsProblemsMain {
    public static void main(String[] args) {
        // Build weighted directed graph edges.
        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        // Run network-delay-time sample.
        System.out.println("LC743 = " + new LC743NetworkDelayTimeSolver().networkDelayTime(times, 4, 2));

        // Build undirected edge list.
        int[][] edges = {
                {1, 2},
                {1, 3},
                {2, 3}
        };
        // Run redundant-connection sample.
        System.out.println("LC684 = " + Arrays.toString(new LC684RedundantConnectionSolver().findRedundantConnection(edges)));

        int[][] points = {
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        };
        System.out.println("LC1584 = " + new LC1584MinCostToConnectAllPointsSolver().minCostConnectPoints(points));

        int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        System.out.println("LC787 = " + new LC787CheapestFlightsWithinKStopsSolver().findCheapestPrice(3, flights, 0, 2, 1));

        int[][] probabilityEdges = {
                {0, 1}, {1, 2}, {0, 2}
        };
        double[] probabilities = {0.5, 0.5, 0.2};
        System.out.println("LC1514 = " + new LC1514PathWithMaximumProbabilitySolver().maxProbability(
                3, probabilityEdges, probabilities, 0, 2));

        System.out.println("LC332 = " + new LC332ReconstructItinerarySolver().findItinerary(
                java.util.List.of(
                        java.util.List.of("MUC", "LHR"),
                        java.util.List.of("JFK", "MUC"),
                        java.util.List.of("SFO", "SJC"),
                        java.util.List.of("LHR", "SFO")
                )));
        System.out.println("LC269 = " + new LC269AlienDictionarySolver().alienOrder(
                new String[]{"wrt", "wrf", "er", "ett", "rftt"}
        ));
        System.out.println("LC778 = " + new LC778SwimInRisingWaterSolver().swimInWater(new int[][]{
                {0, 2},
                {1, 3}
        }));
        System.out.println("LC1631 = " + new LC1631PathWithMinimumEffortSolver().minimumEffortPath(new int[][]{
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        }));
        System.out.println("LC1135 = " + new LC1135ConnectingCitiesWithMinimumCostSolver().minimumCost(
                3, new int[][]{{1, 2, 5}, {1, 3, 6}, {2, 3, 1}}
        ));
    }
}
