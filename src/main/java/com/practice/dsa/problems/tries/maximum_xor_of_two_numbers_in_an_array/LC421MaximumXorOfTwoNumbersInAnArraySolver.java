package com.practice.dsa.problems.tries.maximum_xor_of_two_numbers_in_an_array;

/**
 * LC 421 - Maximum XOR of Two Numbers in an Array
 *
 * Beginner idea:
 * Store every number in a bit trie from the highest bit to the lowest bit.
 * For each number, greedily try to walk to the opposite bit because different bits create XOR = 1.
 */
public class LC421MaximumXorOfTwoNumbersInAnArraySolver {
    private static final int HIGHEST_BIT = 30;

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();

        for (int num : nums) {
            insert(root, num);
        }

        int best = 0;
        for (int num : nums) {
            best = Math.max(best, query(root, num));
        }
        return best;
    }

    private void insert(TrieNode root, int num) {
        TrieNode current = root;
        for (int bit = HIGHEST_BIT; bit >= 0; bit--) {
            int currentBit = (num >> bit) & 1;
            if (current.children[currentBit] == null) {
                current.children[currentBit] = new TrieNode();
            }
            current = current.children[currentBit];
        }
    }

    private int query(TrieNode root, int num) {
        TrieNode current = root;
        int value = 0;

        for (int bit = HIGHEST_BIT; bit >= 0; bit--) {
            int currentBit = (num >> bit) & 1;
            int oppositeBit = 1 - currentBit;

            if (current.children[oppositeBit] != null) {
                value |= (1 << bit);
                current = current.children[oppositeBit];
            } else {
                current = current.children[currentBit];
            }
        }

        return value;
    }

    private static class TrieNode {
        private final TrieNode[] children = new TrieNode[2];
    }
}
