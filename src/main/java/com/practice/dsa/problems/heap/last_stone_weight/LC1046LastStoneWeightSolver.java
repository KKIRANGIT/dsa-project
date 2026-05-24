package com.practice.dsa.problems.heap.last_stone_weight;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * LC 1046 - Last Stone Weight
 *
 * Beginner idea:
 * We always need the two heaviest stones first.
 * A max heap gives those two values quickly.
 */
public class LC1046LastStoneWeightSolver {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
