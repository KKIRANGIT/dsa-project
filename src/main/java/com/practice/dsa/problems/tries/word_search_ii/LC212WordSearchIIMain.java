package com.practice.dsa.problems.tries.word_search_ii;

public class LC212WordSearchIIMain {
    public static void main(String[] args) {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };

        System.out.println(new LC212WordSearchIISolver().findWords(
                board,
                new String[]{"oath", "pea", "eat", "rain"}
        ));
    }
}
