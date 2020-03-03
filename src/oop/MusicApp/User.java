package oop.MusicApp;

import java.util.ArrayList;

public class User {
    private String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Playlist createPlaylist(String title) {
        Playlist newPlaylist = new Playlist(title);
        playlists.add(newPlaylist);
        return newPlaylist;
    }

    public ArrayList<Playlist> findByTitle(String title) {
        ArrayList<Playlist> titlePlaylists = new ArrayList<>();
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(title)) {
                titlePlaylists.add(playlist);
            }
            return titlePlaylists;
        }
        throw new IllegalArgumentException("There is no playlist with title: " + title);
    }

    public void addSongToPlaylist(String title, Song song) {
        for (Playlist currentPlaylist : playlists) {
            if (currentPlaylist.getTitle().equals(title)) {
                currentPlaylist.addSong(song);
            }
        }
    }

}

