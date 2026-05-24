package com.practice.dsa.problems.heap.reorganize_string;

import java.util.PriorityQueue;

/**
 * LC 767 - Reorganize String
 *
 * Beginner idea:
 * Always place the two most frequent remaining characters next to use up the heaviest counts first.
 */
public class LC767ReorganizeStringSolver {
    public String reorganizeString(String s) {
        int[] frequency = new int[26];
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        PriorityQueue<Node> maxHeap = new PriorityQueue<>((first, second) -> Integer.compare(second.count, first.count));
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                maxHeap.offer(new Node((char) ('a' + i), frequency[i]));
            }
        }

        StringBuilder answer = new StringBuilder();

        while (maxHeap.size() > 1) {
            Node first = maxHeap.poll();
            Node second = maxHeap.poll();

            answer.append(first.ch);
            answer.append(second.ch);

            if (--first.count > 0) {
                maxHeap.offer(first);
            }
            if (--second.count > 0) {
                maxHeap.offer(second);
            }
        }

        if (!maxHeap.isEmpty()) {
            Node last = maxHeap.poll();
            if (last.count > 1) {
                return "";
            }
            answer.append(last.ch);
        }

        return answer.toString();
    }

    private static class Node {
        private final char ch;
        private int count;

        private Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
