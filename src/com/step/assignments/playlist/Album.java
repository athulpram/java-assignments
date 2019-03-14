package com.step.assignments.playlist;

import java.util.LinkedList;

public class Album {
    private LinkedList<Song> songs;
    private String albumName;
    public Album(String albumName) {
        this.albumName = albumName;
    }

    public void addSong(Song song){
        this.songs.add(song);
    }
}
