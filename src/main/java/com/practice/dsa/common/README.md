# Common Guide

This folder is the shared foundation layer used by `basics`, `patterns`, and `problems`.

## Purpose

Use this folder to understand the reusable building blocks before looking at algorithm logic.

This folder contains:

- shared node classes such as `ListNode`, `TreeNode`, `GraphNode`
- small value objects such as `Pair`, `Interval`, `Edge`
- debug helpers such as `LinkedListPrinter`, `TreePrinter`, `GraphPrinter`
- builder helpers such as `StructureBuilder`
- directed and weighted graph builder helpers for graph algorithms

## How To Use

1. Read the node classes first so you understand the shapes used across the project.
2. Read the printer helpers next so you know how outputs are visualized.
3. Run `StructureBuilderMain` to see how lists, trees, and graphs are created for demos.
4. Then move to `basics`, because almost every topic there depends on the classes from this folder.

## Recommended Order

1. `ListNode`
2. `DoublyListNode`
3. `TreeNode`
4. `GraphNode`
5. `Pair`
6. `Interval`
7. `Edge`
8. `LinkedListPrinter`
9. `TreePrinter`
10. `GraphPrinter`
11. `StructureBuilder`
12. `StructureBuilderMain`

## Important Note

This folder does not mainly teach algorithms.
It teaches the data shapes and helper utilities that make the rest of the project easier to read and debug.

## Expansion Notes

Shared helpers now cover:

- linked-list building
- tree building from level order
- undirected graph building
- directed graph building
- weighted graph building

That keeps the algorithm classes focused on logic instead of setup boilerplate.
