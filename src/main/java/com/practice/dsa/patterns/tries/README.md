# Trie Patterns

## What This Folder Covers

Use this folder when repeated prefix queries over many strings are the core difficulty.

## How To Identify This Topic

Pick this topic when you see signals like:

- many `startsWith` checks
- dictionary is reused across many queries
- shortest or longest matching prefix matters
- character-by-character branching beats flat hashing

## Study Order

1. `PT1TrieUsageTemplate`
2. `PT2PrefixReplacementTemplate`

## PT1 `PT1TrieUsageTemplate`

- Solves: insert/search/prefix existence problems.
- Identify: many string queries share prefixes and repeated scanning is too slow.
- Typical LeetCode problems: `Implement Trie (Prefix Tree)`, `Design Add and Search Words Data Structure`, `Word Search II` setup.
- Reminder: each node represents a prefix state, not a full word by itself.

## PT2 `PT2PrefixReplacementTemplate`

- Solves: replacement by shortest root or matched prefix from a dictionary.
- Identify: each query word should be cut off as soon as a valid prefix is found.
- Typical LeetCode problems: `Replace Words`, dictionary root replacement tasks, prefix filter variants.
- Reminder: the trie helps you stop early when the first valid root appears.