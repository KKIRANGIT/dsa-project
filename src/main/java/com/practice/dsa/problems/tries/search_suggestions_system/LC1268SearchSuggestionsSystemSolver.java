package com.practice.dsa.problems.tries.search_suggestions_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC 1268 - Search Suggestions System
 *
 * Beginner idea:
 * Sort the products first.
 * For each growing prefix, collect the first three matching products in lexical order.
 */
public class LC1268SearchSuggestionsSystemSolver {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> answer = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();

        for (char ch : searchWord.toCharArray()) {
            prefix.append(ch);
            List<String> suggestions = new ArrayList<>();

            for (String product : products) {
                if (product.startsWith(prefix.toString())) {
                    suggestions.add(product);
                    if (suggestions.size() == 3) {
                        break;
                    }
                }
            }

            answer.add(suggestions);
        }

        return answer;
    }
}
