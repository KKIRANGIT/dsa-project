package com.practice.dsa.problems.tries.implement_trie_ii_prefix_tree;

public class LC1804TrieIIMain {
    public static void main(String[] args) {
        LC1804TrieII trie = new LC1804TrieII();
        trie.insert("apple");
        trie.insert("apple");
        trie.insert("app");

        System.out.println("LC1804 countEqual = " + trie.countWordsEqualTo("apple"));
        System.out.println("LC1804 countPrefix = " + trie.countWordsStartingWith("app"));
        trie.erase("apple");
        System.out.println("LC1804 countEqualAfterErase = " + trie.countWordsEqualTo("apple"));
    }
}
