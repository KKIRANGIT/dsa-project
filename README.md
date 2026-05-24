# Java DSA Project

This repository is organized to help you study for LeetCode and Java software design by keeping five layers together:

- `common`: shared node classes, builders, and debug helpers used everywhere
- `basics`: core data structures and algorithms written from scratch
- `patterns`: reusable templates for common interview problem types
- `problems`: NeetCode-style problems with dedicated `Main` classes
- `designpatterns`: Java design patterns from beginner to advanced with runnable examples

## Naming Convention

LeetCode problem classes include the problem number directly in the class name.

Examples:

- `LC1TwoSumSolver`
- `LC217ContainsDuplicateMain`
- `LC76MinimumWindowSubstringSolver`

## Package Root

`com.practice.dsa`

## Beginner Entry

If you are opening this project for the first time, start here:

1. [00_START_HERE.md](./00_START_HERE.md)
2. [01_PROJECT_MAP.md](./01_PROJECT_MAP.md)
3. [02_STUDY_SEQUENCE.md](./02_STUDY_SEQUENCE.md)
4. [03_HOW_TO_READ_THIS_CODE.md](./03_HOW_TO_READ_THIS_CODE.md)

## Layout

```text
src/main/java/com/practice/dsa/
  common/
  basics/
  patterns/
  problems/
  designpatterns/
```

## How To Use

1. Start with `common` so you know the shared node types and helper utilities.
2. Move to `basics` and run each `Main` class to understand raw implementation mechanics.
3. Move to `patterns` once the mechanics are clear.
4. Use `problems` to see how patterns map to actual interview questions.
5. Study `designpatterns` to build Java object-design and architecture fundamentals.
6. Put breakpoints in each `Main` class to inspect the control flow step by step.

## Current Scope

This initial scaffold includes:

- shared node and helper models
- first set of basic DSA references
- first set of pattern templates
- starter NeetCode problem implementations

The project is designed to scale topic by topic without changing the package layout.
