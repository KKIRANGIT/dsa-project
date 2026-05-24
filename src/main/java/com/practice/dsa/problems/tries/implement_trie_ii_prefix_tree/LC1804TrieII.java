package com.practice.dsa.problems.tries.implement_trie_ii_prefix_tree;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1804 - Implement Trie II (Prefix Tree)
 *
 * Beginner idea:
 * Besides children, each node stores:
 * 1. how many words pass through this node
 * 2. how many words end exactly at this node
 */
public class LC1804TrieII {
    private final TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode current = root;
        current.prefixCount++;

        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
            current.prefixCount++;
        }

        current.wordCount++;
    }

    public int countWordsEqualTo(String word) {
        TrieNode node = findNode(word);
        return node == null ? 0 : node.wordCount;
    }

    public int countWordsStartingWith(String prefix) {
        TrieNode node = findNode(prefix);
        return node == null ? 0 : node.prefixCount;
    }

    public void erase(String word) {
        if (countWordsEqualTo(word) == 0) {
            return;
        }

        TrieNode current = root;
        current.prefixCount--;

        for (char ch : word.toCharArray()) {
            TrieNode next = current.children.get(ch);
            next.prefixCount--;
            current = next;
        }

        current.wordCount--;
    }

    private TrieNode findNode(String text) {
        TrieNode current = root;
        for (char ch : text.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    private static class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private int prefixCount;
        private int wordCount;
    }
}
