package com.practice.dsa.patterns.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Beginner frequency-map pattern.
 *
 * Use this when the main job is counting how many times each value appears.
 */
public class PT1FrequencyMapTemplate {
    public Map<Character, Integer> buildFrequency(String text) {
        // Create map from character to count.
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : text.toCharArray()) {
            // Increase count of current character.
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        // Return completed frequency table.
        return frequency;
    }
}
