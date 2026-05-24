package com.practice.dsa.problems.tries.word_search_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 212 - Word Search II
 *
 * Beginner idea:
 * Build one trie for all candidate words.
 * Then DFS the board while walking through trie nodes.
 */
public class LC212WordSearchIISolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = buildTrie(words);
        List<String> answer = new ArrayList<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                dfs(board, row, col, root, answer);
            }
        }

        return answer;
    }

    private void dfs(char[][] board, int row, int col, TrieNode node, List<String> answer) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return;
        }

        char letter = board[row][col];
        if (letter == '#') {
            return;
        }

        TrieNode next = node.children[letter - 'a'];
        if (next == null) {
            return;
        }

        if (next.word != null) {
            answer.add(next.word);
            next.word = null;
        }

        board[row][col] = '#';
        for (int[] direction : DIRECTIONS) {
            dfs(board, row + direction[0], col + direction[1], next, answer);
        }
        board[row][col] = letter;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.word = word;
        }
        return root;
    }
}
