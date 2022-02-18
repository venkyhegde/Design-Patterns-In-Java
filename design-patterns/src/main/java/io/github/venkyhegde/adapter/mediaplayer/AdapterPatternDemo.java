package io.github.venkyhegde.adapter.mediaplayer;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Happier:Marshmello.mp3");
        audioPlayer.play("avi", "Happier:Marshmello.avi");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        AdvancedMediaPlayer mp4Player = new Mp4Player();

        AdvancedMediaPlayerAdapter adapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        adapter.play("vlc", "Forrest-Gump.vlc");

        adapter = new AdvancedMediaPlayerAdapter(mp4Player);
        adapter.play("mp4", "The-Matrix.mp4");
    }
}
