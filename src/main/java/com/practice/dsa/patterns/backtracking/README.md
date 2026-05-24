# Backtracking Patterns

## What This Folder Covers

Use this folder when the solution space is a decision tree and you must try a choice, recurse, then undo it.

## How To Identify This Topic

Pick this topic when you see signals like:

- generate all valid answers
- try every combination or permutation
- board or word search with visited cells
- choose / skip branching

## Study Order

1. `PT1BacktrackingTemplate`
2. `PT2CombinationTemplate`
3. `PT3PermutationTemplate`
4. `PT4BoardSearchTemplate`

## PT1 `PT1BacktrackingTemplate`

- Solves: general choose/explore/unchoose recursion.
- Identify: each level makes a decision and the next decisions depend on the current partial answer.
- Typical LeetCode problems: `Subsets`, `Combination Sum`, many generic search problems.
- Reminder: always restore state before leaving the recursion frame.

## PT2 `PT2CombinationTemplate`

- Solves: choose `k` items or any subset where order does not matter.
- Identify: `[1,2]` and `[2,1]` should count as the same answer.
- Typical LeetCode problems: `Combinations`, `Combination Sum`, `Subsets`.
- Reminder: advance the start index so the same element ordering is not repeated.

## PT3 `PT3PermutationTemplate`

- Solves: all orderings of values.
- Identify: `[1,2]` and `[2,1]` are different valid answers.
- Typical LeetCode problems: `Permutations`, `Permutations II`, `Letter Tile Possibilities`.
- Reminder: track used elements or swap in place.

## PT4 `PT4BoardSearchTemplate`

- Solves: grid/board exploration with path-specific visited state.
- Identify: you move in directions and cannot reuse the same cell in one path.
- Typical LeetCode problems: `Word Search`, `N-Queens` board-thinking, `Sudoku Solver` search mindset.
- Reminder: mark, recurse, and unmark carefully.