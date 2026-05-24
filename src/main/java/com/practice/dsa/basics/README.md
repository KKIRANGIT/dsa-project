# Basics Guide

This folder is the first learning layer.

## Purpose

Learn how data structures and core algorithms work internally before jumping to interview problems.

## How This Folder Relates To The Other Folders

- `common` gives you the reusable node classes and helper utilities.
- `basics` teaches how the data structure or algorithm itself works.
- `patterns` teaches when to use a reusable solving approach.
- `problems` shows the final interview-style application.

## Recommended Order

1. `arrays`
2. `strings`
3. `hashing`
4. `linkedlist`
5. `stack`
6. `queue`
7. `trees`
8. `heap`
9. `trie`
10. `graph`
11. `unionfind`
12. `sorting`
13. `searching`
14. `recursion`
15. `backtracking`
16. `dp`
17. `math`
18. `bit`
19. `rangequeries`

## How To Use

1. Start with one basics topic only, not the whole folder at once.
2. Open the implementation class first and understand the fields, helper methods, and state changes.
3. Run the matching `Main` file immediately after reading the implementation.
4. Debug line by line and watch how the structure changes after each operation.
5. When the mechanics are clear, move to the matching folder in `patterns`.
6. After that, open the related folder in `problems`.

## Good Beginner Sequence

If you want the easiest first path through this folder, use this order:

1. `arrays`
2. `strings`
3. `hashing`
4. `linkedlist`
5. `stack`
6. `queue`
7. `searching`
8. `sorting`
9. `trees`
10. `graph`
11. `dp`

## Important Note

This folder is not supposed to solve interview problems directly.
It is supposed to make the internal mechanics feel familiar before you start pattern recognition.

## Expanded Reference Coverage

This basics layer now includes reference implementations for:

- array traversals and 1D/2D prefix sums
- string reversal, palindrome checks, and character counting
- simple custom hashing
- singly and doubly linked list operations
- stack and queue implementations in more than one style
- tree traversals, BST operations, and tree metrics
- graph traversal, adjacency matrix, and connected components
- range query structures like Fenwick tree and segment tree
- classic sorts and searches
- recursion, backtracking, and core DP starter problems
- math helpers like sieve and fast power
- bit utilities and subset enumeration by bitmask

## Goal

After this folder, you should understand the mechanics of the structure or algorithm without thinking about a specific LeetCode problem yet.

## Practice Upgrade Path

Use each topic README with this routine:

1. Read the implementation and dry-run the matching `Main` class.
2. Re-implement the same structure or algorithm once without looking at the code.
3. Finish the extra exercises listed in that topic README.
4. Solve at least 3 interview-style follow-up problems from the same topic.
5. Revisit the topic after 2 to 3 days and solve one problem again from scratch.

## Minimum Target Per Topic

- 1 manual re-implementation
- 3 to 5 extra exercises
- 3 real problems with time and space analysis
- 1 written note about when this technique is the wrong choice

That mix is usually enough to move from "I understand the code" to "I can recognize and solve interview problems with it."
