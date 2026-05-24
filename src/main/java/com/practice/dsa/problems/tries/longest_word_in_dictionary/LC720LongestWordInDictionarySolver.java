package com.practice.dsa.problems.tries.longest_word_in_dictionary;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 720 - Longest Word in Dictionary
 *
 * Beginner idea:
 * A word is valid only if every prefix before it also exists as a word.
 * Sort by length and grow a set of buildable words.
 */
public class LC720LongestWordInDictionarySolver {
    public String longestWord(String[] words) {
        java.util.Arrays.sort(words, (first, second) -> {
            if (first.length() != second.length()) {
                return Integer.compare(first.length(), second.length());
            }
            return first.compareTo(second);
        });

        Set<String> buildable = new HashSet<>();
        buildable.add("");
        String answer = "";

        for (String word : words) {
            String prefix = word.substring(0, word.length() - 1);
            if (buildable.contains(prefix)) {
                buildable.add(word);
                if (word.length() > answer.length() || (word.length() == answer.length() && word.compareTo(answer) < 0)) {
                    answer = word;
                }
            }
        }

        return answer;
    }
}
