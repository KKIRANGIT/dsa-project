# Stack Patterns

## What This Folder Covers

Use this folder when the solution depends on last-in-first-out behavior or unresolved earlier elements.

## How To Identify This Topic

Pick this topic when you see signals like:

- nested brackets or expressions
- next greater / smaller element
- previous unresolved index
- rectangle or area logic built from boundaries

## Study Order

1. `PT1BalancedParenthesesTemplate`
2. `PT2MonotonicStackTemplate`
3. `PT3NextGreaterElementTemplate`
4. `PT4HistogramAreaTemplate`

## PT1 `PT1BalancedParenthesesTemplate`

- Solves: matching pairs, nested structures, expression validation.
- Identify: every opening symbol must be matched later in correct order.
- Typical LeetCode problems: `Valid Parentheses`, `Minimum Remove to Make Valid Parentheses`, `Decode String`.
- Reminder: a stack is the natural model for unfinished openings.

## PT2 `PT2MonotonicStackTemplate`

- Solves: next greater/smaller, previous greater/smaller, nearest boundary problems.
- Identify: each element needs help from the nearest better element on the left or right.
- Typical LeetCode problems: `Daily Temperatures`, `Next Greater Element II`, `Sum of Subarray Minimums`.
- Reminder: the stack stores indices in sorted order by value, not arbitrary values.

## PT3 `PT3NextGreaterElementTemplate`

- Solves: direct next-greater lookup problems and one-sided dominance questions.
- Identify: the question literally asks for the next larger value or first larger value to one side.
- Typical LeetCode problems: `Next Greater Element I`, `Daily Temperatures`, `Final Prices With a Special Discount in a Shop`.
- Reminder: this is often a simplified application of the monotonic stack pattern.

## PT4 `PT4HistogramAreaTemplate`

- Solves: largest rectangle, boundary-expansion area, stack-based width calculation.
- Identify: an area is defined by a height and the nearest smaller boundaries.
- Typical LeetCode problems: `Largest Rectangle in Histogram`, `Maximal Rectangle`.
- Reminder: the stack helps you discover the first smaller bar on both sides.