package com.practice.dsa.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterator hides the internal collection structure while still allowing traversal.
 *
 * Use this when:
 * - clients should loop through data without seeing storage details
 * - different traversals may be added later
 */
public class BP7IteratorPattern {
    static class Playlist {
        private final List<String> songs = new ArrayList<>();

        void add(String song) {
            songs.add(song);
        }

        SongIterator iterator() {
            // Caller receives a traversal object instead of the raw list.
            return new SongIterator(songs);
        }
    }

    static class SongIterator {
        private final List<String> songs;
        private int index;

        SongIterator(List<String> songs) {
            this.songs = songs;
        }

        boolean hasNext() {
            return index < songs.size();
        }

        String next() {
            // Return current item, then move iterator position forward.
            return songs.get(index++);
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add("Track 1");
        playlist.add("Track 2");

        SongIterator iterator = playlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
