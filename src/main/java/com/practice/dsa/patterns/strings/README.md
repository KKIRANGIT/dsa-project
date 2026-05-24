# String Algorithm Patterns

## What This Folder Covers

Use this folder when the problem needs more than basic hashing or sliding window and requires specialized string processing.

## How To Identify This Topic

Pick this topic when you see signals like:

- exact pattern matching in text
- repeated substring equality checks
- prefix-function logic
- longest palindromic substring in linear time

## Study Order

1. `PT1KmpStringMatchingTemplate`
2. `PT2ZAlgorithmTemplate`
3. `PT3RollingHashTemplate`
4. `PT4ManacherTemplate`

## PT1 `PT1KmpStringMatchingTemplate`

- Solves: exact pattern matching in linear time.
- Identify: you need to search one pattern in one text without backing up in the text.
- Typical LeetCode problems: `Find the Index of the First Occurrence in a String`, repeated pattern search tasks.
- Reminder: the prefix table tells you how much matched work can be reused.

## PT2 `PT2ZAlgorithmTemplate`

- Solves: prefix-match lengths at every position.
- Identify: many comparisons ask how much of the prefix matches a suffix starting at `i`.
- Typical LeetCode problems: string matching helpers, pattern concatenation tricks, border/prefix tasks.
- Reminder: Z values are a compact summary of prefix agreement across the whole string.

## PT3 `PT3RollingHashTemplate`

- Solves: fast substring comparison and repeated-window matching.
- Identify: many substring equality checks are needed and occasional collision risk is acceptable or can be controlled.
- Typical LeetCode problems: `Repeated DNA Sequences`, repeated substring detection, longest duplicate substring style tasks.
- Reminder: rolling hash is fast, but understand collision tradeoffs.

## PT4 `PT4ManacherTemplate`

- Solves: longest palindromic substring in linear time.
- Identify: the problem is purely about palindromic radii around centers and O(n^2) expansion is too slow.
- Typical LeetCode problems: `Longest Palindromic Substring`, advanced palindrome-query tasks.
- Reminder: this is a specialist pattern. Use it when palindrome-center expansion is the bottleneck.