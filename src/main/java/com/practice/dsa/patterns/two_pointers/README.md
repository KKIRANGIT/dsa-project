# Two Pointers Patterns

## What This Folder Covers

Use this folder when the solution comes from moving two positions through an array, string, or linked list instead of nested loops.

## How To Identify This Topic

Pick this topic when you see signals like:

- sorted array pair search
- remove or compress values in place
- detect middle node or cycle
- compare characters from both ends

## Study Order

1. `PT1OppositeTwoPointersTemplate`
2. `PT2SameDirectionWindowTemplate`
3. `PT3FastSlowPointerTemplate`
4. `PT4InPlaceOverwriteTemplate`

## PT1 `PT1OppositeTwoPointersTemplate`

- Solves: pair search in sorted arrays, palindrome checks, max area using left/right boundaries.
- Identify: one pointer starts at the left and one at the right, and each move discards impossible answers.
- Typical LeetCode problems: `Two Sum II`, `Valid Palindrome`, `Container With Most Water`, `3Sum` inner loop.
- Reminder: only use this when movement from one end gives useful information about the other end.

## PT2 `PT2SameDirectionWindowTemplate`

- Solves: forward-only scans where left and right move at different speeds across the same array.
- Identify: both pointers only move right and the window meaning changes over time.
- Typical LeetCode problems: `Remove Duplicates from Sorted Array`, `Move Zeroes`, some window-style array compaction tasks.
- Reminder: this is the bridge pattern between classic two pointers and sliding window.

## PT3 `PT3FastSlowPointerTemplate`

- Solves: linked list middle, cycle detection, cycle entry, happy number style repeated-state movement.
- Identify: one pointer should move faster than the other to expose structure.
- Typical LeetCode problems: `Linked List Cycle`, `Linked List Cycle II`, `Middle of the Linked List`, `Happy Number`.
- Reminder: when the structure is a linked list or implicit cycle, fast/slow is usually the first pattern to test.

## PT4 `PT4InPlaceOverwriteTemplate`

- Solves: remove elements, compress duplicates, stable overwrite while reusing the same array.
- Identify: the problem asks you to modify the array in place and return a new logical length.
- Typical LeetCode problems: `Remove Element`, `Remove Duplicates from Sorted Array`, `Sort Array By Parity`.
- Reminder: keep one pointer for reading and one pointer for writing.