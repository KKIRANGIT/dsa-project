package com.practice.dsa.patterns.binary_search;

/**
 * Beginner first-true / last-true pattern.
 *
 * Use when the search space is monotonic in boolean form.
 */
public class PT3FirstTrueLastTrueTemplate {
    public int firstTrue(boolean[] flags) {
        int left = 0;
        int right = flags.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (flags[mid]) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public int lastTrue(boolean[] flags) {
        int left = 0;
        int right = flags.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (flags[mid]) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
