package com.musicplaylistqueue;

public class Music extends MediaPlayer {
    private Queue front;
    private Queue rear;
    private Queue currentSong;

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void playNext() {
        if (currentSong != null && currentSong.next != null) {
            currentSong = currentSong.next;
            System.out.println("Playing next: " + currentSong.getSong());
        } else {
            System.out.println("No next song available.");
        }
    }

    @Override
    public void playPrev() {
        if (currentSong != null && currentSong.prev != null) {
            currentSong = currentSong.prev;
            System.out.println("Playing previous: " + currentSong.getSong());
        } else {
            System.out.println("No previous song available.");
        }
    }

    @Override
    public void playNext(String song) {
        Queue temp = front;
        while (temp != null) {
            if (temp.getSong().equals(song)) {
                currentSong = temp;
                System.out.println("Now playing: " + currentSong.getSong());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Song not found in playlist.");
    }

    @Override
    public void addSong(String song) {
        Queue newNode = new Queue(song);
        if (isEmpty()) {
            front = rear = currentSong = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println("Added song at end: " + song);
    }

    @Override
    public void addAtTop(String song) {
        Queue newNode = new Queue(song);
        if (isEmpty()) {
            front = rear = currentSong = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        System.out.println("Added song at beginning: " + song);
    }

    @Override
    public void showPlaylist() {
        if (isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Playlist:");
        Queue temp = front;
        while (temp != null) {
            if (temp == currentSong)
                System.out.println("-> " + temp.getSong() + " [Currently Playing]");
            else
                System.out.println("-> " + temp.getSong());
            temp = temp.next;
        }
    }

    @Override
    public void removeSong(String song) {
        if (isEmpty()) {
            System.out.println("Playlist is empty. Cannot remove song.");
            return;
        }

        Queue temp = front;
        while (temp != null) {
            if (temp.getSong().equals(song)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    front = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    rear = temp.prev;

                // Adjust currentSong if needed
                if (currentSong == temp) {
                    currentSong = temp.next != null ? temp.next : temp.prev;
                }

                System.out.println("Removed song: " + song);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Song not found: " + song);
    }
}

