package com.practice.dsa.problems.arrays_hashing.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC 49 - Group Anagrams
 *
 * Beginner idea:
 * Words that are anagrams become identical after sorting their letters.
 * That sorted word becomes the grouping key.
 */
public class LC49GroupAnagramsSolver {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            // Convert to characters so they can be sorted alphabetically.
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // All anagrams share the same sorted form.
            String key = new String(chars);
            groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}
