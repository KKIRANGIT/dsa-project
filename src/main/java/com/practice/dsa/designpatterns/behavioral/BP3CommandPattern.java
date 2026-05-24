package com.practice.dsa.designpatterns.behavioral;

/**
 * Command turns a request into an object.
 *
 * Use this when:
 * - requests should be queued, logged, retried, or undone
 * - the caller should not know request execution details
 */
public class BP3CommandPattern {
    // Command interface turns an action into an object.
    interface Command {
        void execute();
    }

    static class TextEditor {
        void save() {
            System.out.println("Document saved");
        }
    }

    static class SaveCommand implements Command {
        private final TextEditor editor;

        SaveCommand(TextEditor editor) {
            this.editor = editor;
        }

        public void execute() {
            // Command forwards execution to the receiver.
            editor.save();
        }
    }

    // Invoker object.
    static class Button {
        private final Command command;

        Button(Command command) {
            this.command = command;
        }

        void click() {
            // Button knows only the command object.
            command.execute();
        }
    }

    public static void main(String[] args) {
        Button saveButton = new Button(new SaveCommand(new TextEditor()));
        saveButton.click();
    }
}
