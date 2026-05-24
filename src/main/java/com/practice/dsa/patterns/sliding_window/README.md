# Sliding Window Patterns

## What This Folder Covers

Use this folder when the answer comes from a contiguous subarray or substring.

## How To Identify This Topic

Pick this topic when you see signals like:

- longest or shortest valid substring/subarray
- fixed length `k`
- at most / at least constraints
- update the answer while expanding and shrinking a window

## Study Order

1. `PT1FixedWindowTemplate`
2. `PT2VariableWindowTemplate`
3. `PT3FrequencyWindowTemplate`
4. `PT4MonotonicQueueTemplate`

## PT1 `PT1FixedWindowTemplate`

- Solves: windows of exact size `k`.
- Identify: the question says every candidate window has the same length.
- Typical LeetCode problems: `Maximum Average Subarray I`, `Find All Anagrams in a String`, `Defuse the Bomb`.
- Reminder: add the new right value and remove the old left value every step.

## PT2 `PT2VariableWindowTemplate`

- Solves: longest valid window, shortest valid window, expand-then-shrink problems.
- Identify: the window size changes depending on whether a condition is valid.
- Typical LeetCode problems: `Longest Substring Without Repeating Characters`, `Minimum Size Subarray Sum`, `Best Time to Buy and Sell Stock` pattern view.
- Reminder: define the validity rule clearly before moving the left pointer.

## PT3 `PT3FrequencyWindowTemplate`

- Solves: character-count windows, replacement windows, permutation windows.
- Identify: the condition depends on counts inside the window, not just the sum or length.
- Typical LeetCode problems: `Permutation in String`, `Longest Repeating Character Replacement`, `Minimum Window Substring`.
- Reminder: maintain frequency state incrementally instead of recalculating it for every window.

## PT4 `PT4MonotonicQueueTemplate`

- Solves: window maximum/minimum where each move must return the best element in O(1).
- Identify: the problem asks for best value in each sliding window and plain recomputation is too slow.
- Typical LeetCode problems: `Sliding Window Maximum`, `Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit`.
- Reminder: the deque stores candidates in useful order, not the full window.