package org.example;

public class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String filename) {
        System.out.println("Player MP4:" + filename);
    }
}
