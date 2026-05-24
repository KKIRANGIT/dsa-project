package com.practice.dsa.designpatterns.structural;

/**
 * Decorator adds behavior around an object without changing the original class.
 *
 * Use this when:
 * - behavior should be layered dynamically
 * - inheritance for every combination would become messy
 */
public class SP4DecoratorPattern {
    // Common contract shared by the original object and every decorator.
    interface DataSource {
        String read();
    }

    // Base object with the core behavior.
    static class FileDataSource implements DataSource {
        public String read() {
            return "raw-report-data";
        }
    }

    // Decorator wraps another DataSource and adds extra behavior around it.
    static class LoggingDecorator implements DataSource {
        private final DataSource wrapped;

        LoggingDecorator(DataSource wrapped) {
            this.wrapped = wrapped;
        }

        public String read() {
            // Extra behavior before delegating.
            System.out.println("Reading data...");
            String value = wrapped.read();
            // Extra behavior after delegating.
            System.out.println("Read complete");
            return value;
        }
    }

    public static void main(String[] args) {
        // Logging is added without changing FileDataSource itself.
        DataSource source = new LoggingDecorator(new FileDataSource());
        System.out.println(source.read());
    }
}
