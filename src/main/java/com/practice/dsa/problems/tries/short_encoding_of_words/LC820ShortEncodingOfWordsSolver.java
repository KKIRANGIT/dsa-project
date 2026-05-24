package com.practice.dsa.problems.tries.short_encoding_of_words;

import java.util.Arrays;

/**
 * LC 820 - Short Encoding of Words
 *
 * Beginner idea:
 * If one word is a suffix of another, it does not need its own encoding slot.
 * Building a trie from reversed words makes suffix sharing look like normal prefix sharing.
 */
public class LC820ShortEncodingOfWordsSolver {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (first, second) -> Integer.compare(second.length(), first.length()));
        TrieNode root = new TrieNode();
        int totalLength = 0;

        for (String word : words) {
            if (insert(root, word)) {
                totalLength += word.length() + 1;
            }
        }

        return totalLength;
    }

    private boolean insert(TrieNode root, String word) {
        TrieNode current = root;
        boolean createdNewNode = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
                createdNewNode = true;
            }
            current = current.children[index];
        }

        return createdNewNode;
    }

    private static class TrieNode {
        private final TrieNode[] children = new TrieNode[26];
    }
}
