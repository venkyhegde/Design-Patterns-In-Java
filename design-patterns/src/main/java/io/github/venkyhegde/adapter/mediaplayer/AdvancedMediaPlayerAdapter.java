package io.github.venkyhegde.adapter.mediaplayer;

// MediaPlayer is target
public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer; // adaptee

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
            this.advancedMediaPlayer.loadFileName(fileName);
            this.advancedMediaPlayer.listen();
    }
}
