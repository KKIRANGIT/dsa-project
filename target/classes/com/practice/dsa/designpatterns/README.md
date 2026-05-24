# Design Patterns Guide

This folder is the architecture and object-design learning layer.

## Purpose

Use this section to learn how experienced Java developers organize object creation,
compose classes, decouple behavior, coordinate concurrency, and structure business code.

## Category Order

1. `creational`
2. `structural`
3. `behavioral`
4. `concurrency`
5. `enterprise`

## Naming Rule

- `CP` = creational pattern
- `SP` = structural pattern
- `BP` = behavioral pattern
- `XP` = concurrency pattern
- `EP` = enterprise pattern

Examples:

- `CP1SingletonPattern`
- `SP4DecoratorPattern`
- `BP1StrategyPattern`

## How To Study

1. Read the class-level comment first.
2. Read the small domain example inside the file.
3. Run the `main` method and observe the printed flow.
4. Ask two questions:
   - what problem does this pattern solve?
   - what gets worse if we do not use it here?
5. Only after understanding the simple example, focus on the expert notes.

## Expert Questions To Ask

After you understand the simple example, force yourself to answer:

1. What problem does this pattern solve better than a direct class design?
2. What extra complexity does this pattern introduce?
3. When should this pattern be avoided?
4. Which nearby pattern could solve a similar problem, and what is the tradeoff?

## Scope

This section covers:

- core GoF patterns
- important Java concurrency patterns
- practical enterprise/application structuring patterns

The examples are intentionally small and beginner-friendly,
but the design reasoning is written to be useful even at a more advanced level.

## What This Collection Includes

- creational patterns for object creation decisions
- structural patterns for composition and wrappers
- behavioral patterns for collaboration and control flow
- concurrency patterns for thread coordination
- enterprise patterns for larger application structure

The collection is meant to answer four questions for every pattern:

1. What problem does it solve?
2. When should I use it?
3. When should I avoid it?
4. What nearby pattern could solve the same problem with a different tradeoff?

## How To Read Each Pattern

For every pattern in this folder, study it in this order:

1. Intent: what design pressure created the need for the pattern?
2. Structure: which objects or roles interact?
3. Example: what is the smallest code example that makes the benefit obvious?
4. Tradeoff: what complexity does this introduce?
5. Alternatives: what simpler or nearby option should be considered first?

## Pattern Selection Cheat Sheet

- If the pain is object creation, start with `creational`.
- If the pain is incompatible APIs or wrapper composition, start with `structural`.
- If the pain is behavior branching or object collaboration, start with `behavioral`.
- If the pain is thread safety or async coordination, start with `concurrency`.
- If the pain is codebase organization or persistence boundaries, start with `enterprise`.

## Recommended First Pass

If you want the highest-value subset first, study these before the rest:

1. `CP7SimpleFactoryPattern`
2. `CP2FactoryMethodPattern`
3. `CP4BuilderPattern`
4. `SP1AdapterPattern`
5. `SP4DecoratorPattern`
6. `SP5FacadePattern`
7. `SP8NullObjectPattern`
8. `BP1StrategyPattern`
9. `BP2ObserverPattern`
10. `BP3CommandPattern`
11. `BP4StatePattern`
12. `EP3DependencyInjectionPattern`

## Pattern Hygiene

- Do not add a pattern just because the pattern name sounds impressive.
- Prefer the simplest design that removes the current pain clearly.
- If a direct class design is still easy to read, a pattern may be premature.
- If the pattern adds more abstraction than flexibility, it is the wrong tool.
- Frameworks often already implement patterns for you, so learn the idea, not only the textbook form.

## Detailed Catalog

For the full pattern-by-pattern reference with:

- when to use
- when not to use
- nearby alternatives
- common Java examples

read [PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
