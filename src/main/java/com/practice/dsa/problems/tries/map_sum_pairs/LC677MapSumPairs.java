package com.practice.dsa.problems.tries.map_sum_pairs;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 677 - Map Sum Pairs
 *
 * Beginner idea:
 * Each trie node stores the total score of all words passing through it.
 * When a key is updated, apply only the score difference along its path.
 */
public class LC677MapSumPairs {
    private final TrieNode root;
    private final Map<String, Integer> values;

    public LC677MapSumPairs() {
        this.root = new TrieNode();
        this.values = new HashMap<>();
    }

    public void insert(String key, int val) {
        int difference = val - values.getOrDefault(key, 0);
        values.put(key, val);

        TrieNode current = root;
        current.score += difference;
        for (char ch : key.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
            current.score += difference;
        }
    }

    public int sum(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return 0;
            }
        }
        return current.score;
    }

    private static class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private int score;
    }
}
