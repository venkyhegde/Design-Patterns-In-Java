package io.github.venkyhegde.adapter.mediaplayer;

public interface AdvancedMediaPlayer {
    void loadFileName(String fileName);
    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer{

    String fileName;
    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: "+fileName);
    }
}

class Mp4Player implements AdvancedMediaPlayer{
    String fileName;
    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing Mp4 file. Name: "+fileName);
    }
}