package com.practice.dsa.problems.tries.design_add_and_search_words_data_structure;

/**
 * LC 211 - Design Add and Search Words Data Structure
 *
 * Beginner idea:
 * This is a trie plus wildcard search.
 * The '.' character means "try every possible child at this position".
 */
public class LC211WordDictionary {
    private static class Node {
        // One slot for each lowercase English letter.
        Node[] children = new Node[26];
        // Marks end of a complete word.
        boolean end;
    }

    // Root of the trie.
    private final Node root = new Node();

    public void addWord(String word) {
        // Start from the root for every inserted word.
        Node current = root;
        for (char ch : word.toCharArray()) {
            // Convert character to index.
            int index = ch - 'a';
            // Create node if path does not exist yet.
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            // Move to next node.
            current = current.children[index];
        }
        // Mark end of a valid word.
        current.end = true;
    }

    public boolean search(String word) {
        // Start recursive search from root and index 0.
        return search(word, 0, root);
    }

    private boolean search(String word, int index, Node node) {
        // Missing node means this path failed.
        if (node == null) {
            return false;
        }
        // Reaching the end means the word is valid only if this node ends a word.
        if (index == word.length()) {
            return node.end;
        }

        // Read the current pattern character.
        char ch = word.charAt(index);
        if (ch == '.') {
            // Wildcard means try every possible child.
            for (Node child : node.children) {
                if (search(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        }

        // Normal character means follow only one matching path.
        return search(word, index + 1, node.children[ch - 'a']);
    }
}
