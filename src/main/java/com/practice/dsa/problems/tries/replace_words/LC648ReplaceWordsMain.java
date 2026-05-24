package com.practice.dsa.problems.tries.replace_words;

import java.util.List;

public class LC648ReplaceWordsMain {
    public static void main(String[] args) {
        System.out.println(new LC648ReplaceWordsSolver().replaceWords(
                List.of("cat", "bat", "rat"),
                "the cattle was rattled by the battery"
        ));
    }
}
