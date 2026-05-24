package com.practice.dsa.patterns.tries;

public class PT1TrieUsageTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1TrieUsageTemplate template = new PT1TrieUsageTemplate();
        // Print whether any word starts with "ap".
        System.out.println(template.anyWordStartsWith(new String[]{"apple", "apt", "ball"}, "ap"));
    }
}
