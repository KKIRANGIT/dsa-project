package com.practice.dsa.designpatterns.behavioral;

/**
 * Template Method fixes the high-level algorithm steps in a base class,
 * while subclasses customize selected steps.
 *
 * Use this when:
 * - several workflows share the same outer structure
 * - only some steps vary
 */
public class BP5TemplateMethodPattern {
    static abstract class DataExporter {
        public final void export() {
            // Fixed outer algorithm:
            // subclasses can customize the steps, but not the overall order.
            fetchData();
            transformData();
            writeOutput();
        }

        protected abstract void fetchData();
        protected abstract void transformData();

        protected void writeOutput() {
            System.out.println("Writing final output");
        }
    }

    static class CsvExporter extends DataExporter {
        protected void fetchData() {
            System.out.println("Fetching rows for CSV");
        }

        protected void transformData() {
            System.out.println("Formatting rows as CSV");
        }
    }

    public static void main(String[] args) {
        new CsvExporter().export();
    }
}
