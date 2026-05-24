package com.practice.dsa.designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite lets clients treat one object and a group of objects in the same way.
 *
 * Use this when:
 * - the domain forms a tree structure
 * - leaf objects and container objects should share one interface
 */
public class SP3CompositePattern {
    // Common interface for both single items and grouped items.
    interface FileSystemItem {
        int size();
    }

    // Leaf object: it has no children.
    static class FileItem implements FileSystemItem {
        private final int bytes;

        FileItem(int bytes) {
            this.bytes = bytes;
        }

        public int size() {
            return bytes;
        }
    }

    // Composite object: it can contain children that use the same interface.
    static class FolderItem implements FileSystemItem {
        private final List<FileSystemItem> children = new ArrayList<>();

        void add(FileSystemItem item) {
            children.add(item);
        }

        public int size() {
            // Folder size is the sum of child sizes.
            int total = 0;
            for (FileSystemItem child : children) {
                total += child.size();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        // Client treats file and folder through the same FileSystemItem idea.
        FolderItem project = new FolderItem();
        project.add(new FileItem(100));
        project.add(new FileItem(250));

        FolderItem images = new FolderItem();
        images.add(new FileItem(400));
        project.add(images);

        System.out.println("project size = " + project.size());
    }
}
