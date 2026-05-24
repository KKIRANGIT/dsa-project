package com.practice.dsa.problems.sliding_window.sliding_window_maximum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LC 239 - Sliding Window Maximum
 *
 * Beginner idea:
 * The deque stores indexes, not values.
 * The values at those indexes stay in decreasing order.
 *
 * So:
 * - front of deque = biggest value in the current window
 * - useless smaller values are removed from the back
 */
public class LC239SlidingWindowMaximumSolver {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {
            // Remove indexes that are no longer inside the window.
            while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            // Remove smaller values because they can never become the max
            // while the current bigger value stays in the window.
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            deque.offerLast(right);

            // Once the first full window is formed, record its maximum.
            if (right >= k - 1) {
                answer[right - k + 1] = nums[deque.peekFirst()];
            }
        }

        return answer;
    }
}
