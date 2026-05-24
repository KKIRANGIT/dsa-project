# Math and Geometry Patterns

## What This Folder Covers

Use this folder when the problem is driven by coordinates, matrix simulation, or number rules rather than plain traversal.

## How To Identify This Topic

Pick this topic when you see signals like:

- spiral, rotation, or boundary movement
- points, slopes, or coordinate grouping
- prime generation or divisor logic
- modular arithmetic requirements
- linear recurrences

## Study Order

1. `PT1MatrixSimulationTemplate`
2. `PT2CoordinateHashingTemplate`
3. `PT3SievePrimeTemplate`
4. `PT4ModularArithmeticTemplate`
5. `PT5MatrixExponentiationTemplate`

## PT1 `PT1MatrixSimulationTemplate`

- Solves: matrix traversal, rotation, spiral order, movement with direction changes.
- Identify: the answer comes from carefully simulating motion on a grid.
- Typical LeetCode problems: `Spiral Matrix`, `Rotate Image`, `Set Matrix Zeroes` simulation mindset.
- Reminder: most bugs here are boundary and visited-state bugs.

## PT2 `PT2CoordinateHashingTemplate`

- Solves: treat coordinate-derived signatures as hash keys.
- Identify: points become equal after normalization by slope, offset, or relative shape.
- Typical LeetCode problems: `Max Points on a Line`, island-shape hashing, point grouping tasks.
- Reminder: normalize the representation so equal structures produce the same key.

## PT3 `PT3SievePrimeTemplate`

- Solves: repeated prime lookup or prime counting.
- Identify: many numbers need primality information, not just one number.
- Typical LeetCode problems: `Count Primes`, prime-factor helper tasks.
- Reminder: preprocess once when many prime queries exist.

## PT4 `PT4ModularArithmeticTemplate`

- Solves: large-number arithmetic under modulus, modular exponentiation, inverse-related tasks.
- Identify: the statement explicitly asks for answer modulo `1_000_000_007` or similar.
- Typical LeetCode problems: combinatorics/mod-power tasks, counting problems with large outputs.
- Reminder: modular arithmetic rules must be respected during each operation, not just at the end.

## PT5 `PT5MatrixExponentiationTemplate`

- Solves: linear recurrences accelerated from O(n) to O(log n).
- Identify: a recurrence like Fibonacci can be represented as repeated matrix multiplication.
- Typical LeetCode problems: Fibonacci-style fast recurrence tasks, advanced counting recurrences.
- Reminder: this is only worth using when the recurrence has a fixed transition matrix.