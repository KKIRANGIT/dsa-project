package com.practice.dsa.designpatterns.behavioral;

/**
 * Visitor moves operations out of an object structure so new operations can be added without changing element classes.
 *
 * Use this when:
 * - object structure is stable
 * - new operations on that structure change frequently
 */
public class BP10VisitorPattern {
    // Element interface:
    // every shape accepts a visitor.
    interface Shape {
        void accept(ShapeVisitor visitor);
    }

    // Visitor interface:
    // one visit method per element type.
    interface ShapeVisitor {
        void visit(Circle circle);
        void visit(Rectangle rectangle);
    }

    static class Circle implements Shape {
        public void accept(ShapeVisitor visitor) {
            visitor.visit(this);
        }
    }

    static class Rectangle implements Shape {
        public void accept(ShapeVisitor visitor) {
            visitor.visit(this);
        }
    }

    static class RenderVisitor implements ShapeVisitor {
        public void visit(Circle circle) {
            System.out.println("Rendering circle");
        }

        public void visit(Rectangle rectangle) {
            System.out.println("Rendering rectangle");
        }
    }

    public static void main(String[] args) {
        // One visitor object can perform one operation across many element types.
        ShapeVisitor visitor = new RenderVisitor();
        new Circle().accept(visitor);
        new Rectangle().accept(visitor);
    }
}
