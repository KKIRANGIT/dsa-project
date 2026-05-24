# Dynamic Programming Patterns

## What This Folder Covers

Use this folder when the problem has overlapping subproblems and you can build bigger answers from smaller answers.

## How To Identify This Topic

Pick this topic when you see signals like:

- minimum or maximum answer over choices
- count number of ways
- repeated recursion over the same state
- choose/take/skip decisions
- string or grid tables
- interval splitting

## Study Order

1. `PT1MemoizationTemplate`
2. `PT2OneDimensionalDpTemplate`
3. `PT3TwoDimensionalDpTemplate`
4. `PT4TakeOrSkipDpTemplate`
5. `PT5KnapsackTemplate`
6. `PT6IntervalDpTemplate`
7. `PT7LisPatienceSortingTemplate`
8. `PT8StateCompressionDpTemplate`
9. `PT9DigitDpTemplate`
10. `PT10GameDpMinimaxTemplate`

## PT1 `PT1MemoizationTemplate`

- Solves: top-down recursion with repeated states.
- Identify: plain recursion repeats the same subproblems again and again.
- Typical LeetCode problems: `Climbing Stairs`, `Decode Ways`, `Word Break` recursive view.
- Reminder: define the state first, then cache by that state.

## PT2 `PT2OneDimensionalDpTemplate`

- Solves: linear DP over an index or length.
- Identify: answer at position `i` depends on a few earlier positions.
- Typical LeetCode problems: `House Robber`, `Min Cost Climbing Stairs`, `Longest Increasing Subsequence` O(n^2) view.
- Reminder: understand what `dp[i]` means before writing transitions.

## PT3 `PT3TwoDimensionalDpTemplate`

- Solves: grid DP, string alignment, prefix state tables.
- Identify: state needs two coordinates or two indices.
- Typical LeetCode problems: `Unique Paths`, `Longest Common Subsequence`, `Edit Distance`.
- Reminder: define each dimension clearly and be careful with base rows and columns.

## PT4 `PT4TakeOrSkipDpTemplate`

- Solves: each item creates a choice to include or exclude.
- Identify: every step branches into use-it or ignore-it.
- Typical LeetCode problems: `House Robber`, `Delete and Earn`, subset-choice families.
- Reminder: the recurrence should compare both choices explicitly.

## PT5 `PT5KnapsackTemplate`

- Solves: capacity-constrained item selection.
- Identify: each item has weight/cost and value/profit, and capacity is limited.
- Typical LeetCode problems: `Partition Equal Subset Sum`, `Target Sum` DP view, classic 0/1 knapsack variants.
- Reminder: capacity is usually the second dimension of the state.

## PT6 `PT6IntervalDpTemplate`

- Solves: answers over subarrays/substrings where the interval can split.
- Identify: the natural state is `[left, right]`.
- Typical LeetCode problems: `Burst Balloons`, `Minimum Cost Tree From Leaf Values`, palindrome interval tasks.
- Reminder: think about the last cut, last balloon, or split point inside the interval.

## PT7 `PT7LisPatienceSortingTemplate`

- Solves: LIS in O(n log n) and similar monotonic replacement DP patterns.
- Identify: you need longest increasing subsequence length faster than O(n^2).
- Typical LeetCode problems: `Longest Increasing Subsequence`, envelope nesting variants.
- Reminder: the helper array does not store the real subsequence; it stores best tails.

## PT8 `PT8StateCompressionDpTemplate`

- Solves: DP over subsets when the set of choices fits in a bitmask.
- Identify: state must remember which items or nodes are already used.
- Typical LeetCode problems: `Can I Win`, `Shortest Path Visiting All Nodes`, small traveling-salesman style tasks.
- Reminder: use bitmasks only when the state space is small enough.

## PT9 `PT9DigitDpTemplate`

- Solves: count or optimize numbers under digit constraints.
- Identify: the problem asks about all numbers in a range with positional digit rules.
- Typical LeetCode problems: digit-counting constraints, no-repeated-digit counts, bounded number counting.
- Reminder: typical state includes index, tight flag, and sometimes started/sum/mask.

## PT10 `PT10GameDpMinimaxTemplate`

- Solves: two-player optimal play where each move changes the future game state.
- Identify: both players play optimally and your gain is the opponent's loss or influences the outcome.
- Typical LeetCode problems: `Stone Game`, `Predict the Winner`, turn-based interval games.
- Reminder: the state answer usually means the best score difference or whether current player can force a win.