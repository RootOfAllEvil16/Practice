package oop.MusicApp;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long length = 0;
        if (songs.isEmpty()) {
            System.out.println("No songs in playlist");
        }
        for (Song song : songs) {
            length += song.getLength();
        }
        return length;
    }

    public ArrayList<Song> findByTitlePart(String titlePart) {
        ArrayList<Song> songs = new ArrayList<>();
        String titlePart1 = titlePart.toLowerCase();
        for (Song song : this.songs) {
            song.getTitle().toLowerCase();
            if (song.getTitle().contains(titlePart1)) {
                songs.add(song);
            }
        }
        return songs;
    }

    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> songs = new ArrayList<>();
        for (Song song : this.songs) {
            if (song.getAuthor().contains(author)) {
                songs.add(song);
            }
        }
        return songs;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }

}
