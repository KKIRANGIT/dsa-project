package com.practice.dsa.basics.trie;

public class TrieMain {
    public static void main(String[] args) {
        // Create trie object.
        Trie trie = new Trie();
        // Insert sample words.
        trie.insert("cat");
        trie.insert("car");

        // Exact search for existing word.
        System.out.println("search cat   = " + trie.search("cat"));
        // Exact search for missing word.
        // "cap" shares prefix "ca" but full word path is incomplete.
        System.out.println("search cap   = " + trie.search("cap"));
        // Prefix check asks only whether the path exists.
        System.out.println("startsWith ca = " + trie.startsWith("ca"));
    }
}
