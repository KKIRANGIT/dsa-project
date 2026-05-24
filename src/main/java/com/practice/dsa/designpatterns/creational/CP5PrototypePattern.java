package com.practice.dsa.designpatterns.creational;

/**
 * Prototype creates new objects by cloning existing configured objects.
 *
 * Use this when:
 * - copying a prepared object is easier than rebuilding it
 * - many objects share the same base configuration
 */
public class CP5PrototypePattern {
    static class ReportTemplate {
        // Shared base structure of a report.
        private final String header;
        private final String footer;
        private final String body;

        ReportTemplate(String header, String footer, String body) {
            this.header = header;
            this.footer = footer;
            this.body = body;
        }

        ReportTemplate copyWithBody(String newBody) {
            // Clone the existing template structure,
            // but replace only the part that changes.
            return new ReportTemplate(header, footer, newBody);
        }

        public String toString() {
            return header + System.lineSeparator() + body + System.lineSeparator() + footer;
        }
    }

    public static void main(String[] args) {
        // Base object acts like a ready-made template.
        ReportTemplate base = new ReportTemplate("=== Monthly Report ===", "--- End ---", "Default body");
        // New object is created by copying the template and changing one field.
        ReportTemplate custom = base.copyWithBody("Sales increased by 12%");

        System.out.println(custom);
    }
}
