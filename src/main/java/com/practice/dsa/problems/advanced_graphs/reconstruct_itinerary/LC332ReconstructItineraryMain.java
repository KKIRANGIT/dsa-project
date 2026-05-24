package com.practice.dsa.problems.advanced_graphs.reconstruct_itinerary;

import java.util.List;

public class LC332ReconstructItineraryMain {
    public static void main(String[] args) {
        List<List<String>> tickets = new java.util.ArrayList<>();
        tickets.add(List.of("MUC", "LHR"));
        tickets.add(List.of("JFK", "MUC"));
        tickets.add(List.of("SFO", "SJC"));
        tickets.add(List.of("LHR", "SFO"));

        System.out.println("LC332 = " + new LC332ReconstructItinerarySolver().findItinerary(tickets));
    }
}
