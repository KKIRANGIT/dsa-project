package com.practice.dsa.basics.strings;

/**
 * Beginner mutable-string reference.
 *
 * StringBuilder is important because repeated string concatenation creates many temporary objects.
 */
public class StringBuilderBasics {
    public String joinWithComma(String[] words) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);
            if (i < words.length - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    public String repeatCharacter(char value, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(value);
        }
        return builder.toString();
    }
}
