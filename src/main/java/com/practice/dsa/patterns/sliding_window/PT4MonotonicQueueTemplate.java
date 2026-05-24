package com.practice.dsa.patterns.sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Beginner monotonic-queue pattern.
 *
 * Use this for sliding-window maximum/minimum problems.
 */
public class PT4MonotonicQueueTemplate {
    public int[] windowMaximums(int[] nums, int k) {
        int[] answer = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {
            while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            deque.offerLast(right);

            if (right >= k - 1) {
                answer[right - k + 1] = nums[deque.peekFirst()];
            }
        }

        return answer;
    }
}
