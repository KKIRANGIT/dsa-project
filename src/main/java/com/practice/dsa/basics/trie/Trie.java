package com.practice.dsa.basics.trie;

/**
 * Beginner trie reference.
 *
 * Trie is a tree for strings.
 * Each edge represents one character.
 *
 * Important beginner idea:
 * the path from the root to a node represents a prefix.
 * That is why tries are strong at prefix-based problems.
 */
public class Trie {
    private static class Node {
        // One slot for each lowercase English letter.
        Node[] children = new Node[26];
        // Marks that a complete word ends here.
        boolean end;
    }

    // Root is shared starting point for all words.
    private final Node root = new Node();

    public void insert(String word) {
        // Start from root.
        Node current = root;
        for (char ch : word.toCharArray()) {
            // Convert character to child index.
            int index = ch - 'a';
            // Create the next prefix node if this character path does not exist yet.
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            // Move to next node.
            current = current.children[index];
        }
        // Mark end of word.
        current.end = true;
    }

    public boolean search(String word) {
        // Walk the path for the full word.
        Node node = walk(word);
        // Word is valid only if path exists and end marker is true.
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        // Prefix exists if path exists.
        return walk(prefix) != null;
    }

    private Node walk(String text) {
        // Start from root.
        Node current = root;
        for (char ch : text.toCharArray()) {
            // Convert character to array index.
            int index = ch - 'a';
            // Missing child means this prefix path does not exist in the trie.
            if (current.children[index] == null) {
                return null;
            }
            // Move deeper into trie.
            current = current.children[index];
        }
        // Return node reached by the path.
        return current;
    }
}
