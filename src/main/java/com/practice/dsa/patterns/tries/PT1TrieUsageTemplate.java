package com.practice.dsa.patterns.tries;

import com.practice.dsa.basics.trie.Trie;

/**
 * Beginner trie-usage pattern.
 *
 * Use a trie when many queries involve prefixes.
 */
public class PT1TrieUsageTemplate {
    public boolean anyWordStartsWith(String[] words, String prefix) {
        // Create trie object.
        Trie trie = new Trie();
        for (String word : words) {
            // Insert each word.
            trie.insert(word);
        }
        // Check whether prefix exists.
        return trie.startsWith(prefix);
    }
}
