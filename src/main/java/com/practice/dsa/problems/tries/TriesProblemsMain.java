package com.practice.dsa.problems.tries;

import com.practice.dsa.problems.tries.design_add_and_search_words_data_structure.LC211WordDictionary;
import com.practice.dsa.problems.tries.implement_trie_ii_prefix_tree.LC1804TrieII;
import com.practice.dsa.problems.tries.implement_trie_prefix_tree.LC208Trie;
import com.practice.dsa.problems.tries.longest_word_in_dictionary.LC720LongestWordInDictionarySolver;
import com.practice.dsa.problems.tries.map_sum_pairs.LC677MapSumPairs;
import com.practice.dsa.problems.tries.maximum_xor_of_two_numbers_in_an_array.LC421MaximumXorOfTwoNumbersInAnArraySolver;
import com.practice.dsa.problems.tries.replace_words.LC648ReplaceWordsSolver;
import com.practice.dsa.problems.tries.search_suggestions_system.LC1268SearchSuggestionsSystemSolver;
import com.practice.dsa.problems.tries.short_encoding_of_words.LC820ShortEncodingOfWordsSolver;
import com.practice.dsa.problems.tries.word_search_ii.LC212WordSearchIISolver;

import java.util.List;

public class TriesProblemsMain {
    public static void main(String[] args) {
        // Create and test the Trie problem class.
        LC208Trie trie = new LC208Trie();
        trie.insert("apple");
        System.out.println("LC208 = " + trie.search("apple"));

        // Create and test the Word Dictionary problem class.
        LC211WordDictionary dictionary = new LC211WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        System.out.println("LC211 = " + dictionary.search(".ad"));

        System.out.println("LC648 = " + new LC648ReplaceWordsSolver().replaceWords(
                List.of("cat", "bat", "rat"),
                "the cattle was rattled by the battery"
        ));

        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        System.out.println("LC212 = " + new LC212WordSearchIISolver().findWords(
                board,
                new String[]{"oath", "pea", "eat", "rain"}
        ));

        System.out.println("LC720 = " + new LC720LongestWordInDictionarySolver().longestWord(
                new String[]{"w", "wo", "wor", "worl", "world"}
        ));

        LC677MapSumPairs mapSum = new LC677MapSumPairs();
        mapSum.insert("apple", 3);
        mapSum.insert("app", 2);
        System.out.println("LC677 = " + mapSum.sum("ap"));
        System.out.println("LC1268 = " + new LC1268SearchSuggestionsSystemSolver().suggestedProducts(
                new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"
        ));
        LC1804TrieII trieII = new LC1804TrieII();
        trieII.insert("apple");
        trieII.insert("apple");
        trieII.insert("app");
        System.out.println("LC1804 = " + trieII.countWordsStartingWith("app"));
        System.out.println("LC421 = " + new LC421MaximumXorOfTwoNumbersInAnArraySolver().findMaximumXOR(
                new int[]{3, 10, 5, 25, 2, 8}
        ));
        System.out.println("LC820 = " + new LC820ShortEncodingOfWordsSolver().minimumLengthEncoding(
                new String[]{"time", "me", "bell"}
        ));
    }
}
