package com.practice.dsa.designpatterns.enterprise;

/**
 * Specification expresses business rules as reusable objects.
 *
 * Use this when:
 * - filtering or validation rules should stay composable
 * - business conditions are reused in many places
 */
public class EP2SpecificationPattern {
    // Domain object to evaluate.
    static class Product {
        final String category;
        final int price;

        Product(String category, int price) {
            this.category = category;
            this.price = price;
        }
    }

    // Specification interface wraps one business rule.
    interface Specification<T> {
        boolean isSatisfiedBy(T candidate);
    }

    static class ExpensiveProductSpec implements Specification<Product> {
        public boolean isSatisfiedBy(Product candidate) {
            return candidate.price >= 1000;
        }
    }

    public static void main(String[] args) {
        Product phone = new Product("electronics", 25000);
        // Business rule is represented as an object, not hard-coded in caller logic.
        System.out.println(new ExpensiveProductSpec().isSatisfiedBy(phone));
    }
}
