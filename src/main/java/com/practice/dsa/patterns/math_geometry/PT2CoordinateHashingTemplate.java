package com.practice.dsa.patterns.math_geometry;

import java.util.HashMap;
import java.util.Map;

/**
 * Beginner coordinate-hashing pattern.
 */
public class PT2CoordinateHashingTemplate {
    public Map<String, Integer> countPoints(int[][] points) {
        Map<String, Integer> count = new HashMap<>();

        for (int[] point : points) {
            String key = point[0] + "," + point[1];
            count.put(key, count.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
