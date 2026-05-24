package com.practice.dsa.patterns.tries;

import com.practice.dsa.basics.trie.Trie;

/**
 * Beginner prefix-replacement trie pattern.
 */
public class PT2PrefixReplacementTemplate {
    public String chooseMatchingRoot(String[] roots, String query) {
        Trie trie = new Trie();
        for (String root : roots) {
            trie.insert(root);
        }

        StringBuilder prefix = new StringBuilder();
        for (char ch : query.toCharArray()) {
            prefix.append(ch);
            if (trie.search(prefix.toString())) {
                return prefix.toString();
            }
        }

        return query;
    }
}
