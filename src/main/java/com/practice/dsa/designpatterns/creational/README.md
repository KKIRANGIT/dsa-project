# Creational Patterns

Study order:
1. `CP7SimpleFactoryPattern`
2. `CP1SingletonPattern`
3. `CP2FactoryMethodPattern`
4. `CP3AbstractFactoryPattern`
5. `CP4BuilderPattern`
6. `CP5PrototypePattern`
7. `CP6ObjectPoolPattern`

Use this folder when the main problem is object creation:
- who creates objects
- how object creation is controlled
- how complex construction stays readable
- how families of related objects stay consistent

Common tradeoffs:
- helps reduce construction coupling
- can add extra classes quickly
- sometimes overkill when plain constructors are already clear

## Best First Choices

- Start with `SimpleFactory`, `FactoryMethod`, and `Builder`.
- Study `Singleton` mainly to understand its tradeoffs, not because it should be used often.
- Use `AbstractFactory`, `Prototype`, and `ObjectPool` after the simpler creation patterns feel obvious.

## What To Compare Inside This Folder

- `SimpleFactory` vs `FactoryMethod`: centralized creation switch vs subclass-driven creation.
- `FactoryMethod` vs `AbstractFactory`: one product type vs a family of related products.
- `Builder` vs constructors: readable step-by-step construction vs compact direct construction.
- `Prototype` vs factory creation: clone existing configured objects vs create fresh instances.
- `ObjectPool` vs normal allocation: reuse expensive objects vs trust the runtime to allocate cheaply.

See the full reference in [../PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
