package com.practice.dsa.problems.greedy.partition_labels;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 763 - Partition Labels
 *
 * Beginner idea:
 * Each partition must extend until the farthest last occurrence of all characters seen so far.
 */
public class LC763PartitionLabelsSolver {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> partitions = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partitions.add(end - start + 1);
                start = i + 1;
            }
        }

        return partitions;
    }
}
