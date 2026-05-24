package com.practice.dsa.problems.tries.implement_trie_prefix_tree;

public class LC208TrieMain {
    public static void main(String[] args) {
        // Create the trie object.
        LC208Trie trie = new LC208Trie();
        // Insert a word.
        trie.insert("apple");
        // Check whether the exact word exists.
        System.out.println(trie.search("apple"));
        // Check whether a prefix exists.
        System.out.println(trie.startsWith("app"));
    }
}
