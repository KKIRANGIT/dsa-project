package com.practice.dsa.patterns.backtracking;

public class PT4BoardSearchTemplateMain {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        PT4BoardSearchTemplate template = new PT4BoardSearchTemplate();
        System.out.println(template.exists(board, "ABCCED"));
    }
}
