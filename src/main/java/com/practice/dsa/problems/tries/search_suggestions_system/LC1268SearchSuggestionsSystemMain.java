package com.practice.dsa.problems.tries.search_suggestions_system;

public class LC1268SearchSuggestionsSystemMain {
    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        System.out.println("LC1268 = " + new LC1268SearchSuggestionsSystemSolver().suggestedProducts(products, "mouse"));
    }
}
