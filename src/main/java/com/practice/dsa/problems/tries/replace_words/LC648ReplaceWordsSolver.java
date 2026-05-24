package com.practice.dsa.problems.tries.replace_words;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LC 648 - Replace Words
 *
 * Beginner idea:
 * Try prefixes from shortest to longest and stop at the first root found.
 */
public class LC648ReplaceWordsSolver {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> roots = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            builder.append(shortestRoot(word, roots));
            if (index < words.length - 1) {
                builder.append(' ');
            }
        }

        return builder.toString();
    }

    private String shortestRoot(String word, Set<String> roots) {
        for (int length = 1; length <= word.length(); length++) {
            String prefix = word.substring(0, length);
            if (roots.contains(prefix)) {
                return prefix;
            }
        }
        return word;
    }
}
