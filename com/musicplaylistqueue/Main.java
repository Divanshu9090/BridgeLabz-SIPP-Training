package com.musicplaylistqueue;

public class Main {
    public static void main(String[] args) {
        // Create a new Music instance
        Music player = new Music();

        // Add songs to the playlist
        player.addSong("Song A");
        player.addSong("Song B");
        player.addSong("Song C");

        // Show the current playlist
        player.showPlaylist();

        // perform various operations
        player.playNext();
        player.playPrev();

        player.playNext("Song B");
        player.playNext();

        // Add a song at the top of the playlist
        player.addAtTop("Intro Song");
        player.showPlaylist();

        // Remove a song from the playlist
        player.removeSong("Song C");
        player.showPlaylist();
    }
}
