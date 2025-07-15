package com.musicplaylistqueue;

public class Queue {
	Queue next,prev;
	private String song;
	public Queue(String song) {
		this.song = song;
	}
	
	public String getSong() {
		return this.song;
	}
}
