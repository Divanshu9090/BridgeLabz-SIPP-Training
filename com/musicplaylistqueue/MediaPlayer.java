package com.musicplaylistqueue;

abstract class MediaPlayer {
	public abstract void playNext();
	public abstract void playPrev();
	public abstract void playNext(String song);
	public abstract void addSong(String song);
	public abstract void addAtTop(String song);
	public abstract void showPlaylist();
	public abstract void removeSong(String song);
	
}
