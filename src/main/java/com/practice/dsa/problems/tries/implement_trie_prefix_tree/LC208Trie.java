package com.practice.dsa.problems.tries.implement_trie_prefix_tree;

/**
 * LC 208 - Implement Trie (Prefix Tree)
 *
 * Beginner idea:
 * Each node stores links to the next characters.
 * Walking from root through characters follows a word path.
 */
public class LC208Trie {
    private static class Node {
        // One slot for each lowercase English letter.
        Node[] children = new Node[26];
        // Marks whether a full word ends at this node.
        boolean end;
    }

    // Root is the starting point for every word.
    private final Node root = new Node();

    public void insert(String word) {
        // Start from root for every new word.
        Node current = root;
        for (char ch : word.toCharArray()) {
            // Convert character to array index.
            int index = ch - 'a';
            // Create a new node if this path does not exist yet.
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            // Move to the next node in the path.
            current = current.children[index];
        }
        // Mark the final node as a completed word.
        current.end = true;
    }

    public boolean search(String word) {
        // Walk the word path.
        Node node = walk(word);
        // Word exists only if path exists and word ends here.
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        // Prefix exists if the path exists at all.
        return walk(prefix) != null;
    }

    private Node walk(String text) {
        // Start from root.
        Node current = root;
        for (char ch : text.toCharArray()) {
            // Convert character to array index.
            int index = ch - 'a';
            // Missing path means the word/prefix does not exist.
            if (current.children[index] == null) {
                return null;
            }
            // Move deeper into the trie.
            current = current.children[index];
        }
        // Return the final node reached by the path.
        return current;
    }
}
