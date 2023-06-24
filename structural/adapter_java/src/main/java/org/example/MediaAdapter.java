package org.example;

public class MediaAdapter implements  MediaPlayer{
    private AdvanceMediaPlayer mp4player;

    public MediaAdapter() {
        mp4player = new MP4Player();
    }

    @Override
    public void play(String fileName) {
        mp4player.playMp4(fileName);
    }
}
