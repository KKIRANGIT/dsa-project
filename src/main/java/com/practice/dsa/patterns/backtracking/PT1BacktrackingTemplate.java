package com.practice.dsa.patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * General beginner backtracking template.
 *
 * The standard pattern is:
 * 1. choose
 * 2. explore
 * 3. unchoose
 *
 * This file uses binary strings as the simplest example.
 */
public class PT1BacktrackingTemplate {
    public List<String> generateBinaryStrings(int n) {
        // Result will hold all completed strings.
        List<String> result = new ArrayList<>();
        // Start from empty path.
        backtrack(n, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int n, StringBuilder path, List<String> result) {
        // When desired length is reached, save the built string.
        if (path.length() == n) {
            result.add(path.toString());
            return;
        }

        // Choose 0.
        path.append('0');
        // Explore deeper with that choice.
        backtrack(n, path, result);
        // Undo the choice.
        path.deleteCharAt(path.length() - 1);

        // Choose 1.
        path.append('1');
        // Explore deeper with that choice.
        backtrack(n, path, result);
        // Undo the choice.
        path.deleteCharAt(path.length() - 1);
    }
}
