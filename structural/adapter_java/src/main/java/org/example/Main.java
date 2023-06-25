package org.example;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3Player();
        mediaPlayer.play("newSong.mp3");

        mediaPlayer = new MediaAdapter();
        mediaPlayer.play("video.mp4");

        System.out.println("Hello world!");
    }
}