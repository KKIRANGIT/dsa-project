package com.practice.dsa.problems.tries.design_add_and_search_words_data_structure;

public class LC211WordDictionaryMain {
    public static void main(String[] args) {
        // Create the dictionary object.
        LC211WordDictionary dictionary = new LC211WordDictionary();
        // Add words.
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        // Search using '.' wildcard.
        System.out.println(dictionary.search(".ad"));
    }
}
