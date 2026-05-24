package com.practice.dsa.patterns.arrays_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Beginner grouping-by-key pattern.
 *
 * Use this when different inputs should be grouped by a normalized key.
 */
public class PT5GroupingByKeyTemplate {
    public Map<Integer, List<String>> groupByLength(String[] words) {
        Map<Integer, List<String>> grouped = new HashMap<>();

        for (String word : words) {
            grouped.computeIfAbsent(word.length(), ignored -> new ArrayList<>()).add(word);
        }

        return grouped;
    }
}
