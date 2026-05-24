package com.practice.dsa.designpatterns.enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit of Work collects several changes and commits them together.
 *
 * Use this when:
 * - many related updates should be treated as one logical save
 * - persistence should happen in one controlled step
 */
public class EP5UnitOfWorkPattern {
    static class UnitOfWork {
        private final List<Runnable> operations = new ArrayList<>();

        void register(Runnable operation) {
            // Collect pending work instead of executing immediately.
            operations.add(operation);
        }

        void commit() {
            // Execute all related operations together.
            for (Runnable operation : operations) {
                operation.run();
            }
            // Clear the tracked operations after successful commit.
            operations.clear();
        }
    }

    public static void main(String[] args) {
        // Both operations belong to one logical business action.
        UnitOfWork unitOfWork = new UnitOfWork();
        unitOfWork.register(() -> System.out.println("Insert order"));
        unitOfWork.register(() -> System.out.println("Insert order items"));
        unitOfWork.commit();
    }
}
