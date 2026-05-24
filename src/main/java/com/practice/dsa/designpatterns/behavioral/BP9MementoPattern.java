package com.practice.dsa.designpatterns.behavioral;

/**
 * Memento captures and restores an object's internal state without exposing its internals.
 *
 * Use this when:
 * - undo/rollback is needed
 * - snapshots of object state should be stored safely
 */
public class BP9MementoPattern {
    static class TextEditor {
        private String text;

        void type(String text) {
            this.text = text;
        }

        Snapshot save() {
            // Capture current internal state into a snapshot object.
            return new Snapshot(text);
        }

        void restore(Snapshot snapshot) {
            // Replace current state with an earlier snapshot.
            this.text = snapshot.text;
        }

        String text() {
            return text;
        }
    }

    static class Snapshot {
        private final String text;

        Snapshot(String text) {
            this.text = text;
        }
    }

    public static void main(String[] args) {
        // Save one version, modify the object, then roll back.
        TextEditor editor = new TextEditor();
        editor.type("Draft 1");
        Snapshot snapshot = editor.save();
        editor.type("Draft 2");
        editor.restore(snapshot);
        System.out.println(editor.text());
    }
}
