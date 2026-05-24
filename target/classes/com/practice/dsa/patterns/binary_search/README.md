# Binary Search Patterns

## What This Folder Covers

Use this folder when the search space is ordered or becomes monotonic after the right transformation.

## How To Identify This Topic

Pick this topic when you see signals like:

- sorted input
- find first or last valid position
- minimize the maximum or maximize the minimum
- one side of the answer space is valid and the other side is invalid

## Study Order

1. `PT1BinarySearchTemplate`
2. `PT2LowerUpperBoundTemplate`
3. `PT3FirstTrueLastTrueTemplate`
4. `PT4RotatedSearchDecisionTemplate`

## PT1 `PT1BinarySearchTemplate`

- Solves: classic exact search and search-on-answer starter cases.
- Identify: every comparison can discard half of the current space.
- Typical LeetCode problems: `Binary Search`, `Search Insert Position`, `Sqrt(x)`.
- Reminder: write the loop condition and the mid calculation carefully.

## PT2 `PT2LowerUpperBoundTemplate`

- Solves: first occurrence, last occurrence, insert position, count of values in a range.
- Identify: the target may appear many times and you need a boundary instead of any one match.
- Typical LeetCode problems: `Find First and Last Position of Element in Sorted Array`, `Search Insert Position`.
- Reminder: lower bound and upper bound are boundary-finding tools, not just target-finding tools.

## PT3 `PT3FirstTrueLastTrueTemplate`

- Solves: answer-space binary search where a predicate flips from false to true or true to false.
- Identify: you can ask "is this answer feasible?" and the result is monotonic.
- Typical LeetCode problems: `Koko Eating Bananas`, `Capacity To Ship Packages Within D Days`, `Split Array Largest Sum`.
- Reminder: define the boolean predicate first. The search loop becomes easy after that.

## PT4 `PT4RotatedSearchDecisionTemplate`

- Solves: rotated sorted arrays and cases where one half stays ordered.
- Identify: the array looks sorted except for one pivot break.
- Typical LeetCode problems: `Search in Rotated Sorted Array`, `Find Minimum in Rotated Sorted Array`.
- Reminder: at each step, decide which half is reliably ordered before discarding anything.