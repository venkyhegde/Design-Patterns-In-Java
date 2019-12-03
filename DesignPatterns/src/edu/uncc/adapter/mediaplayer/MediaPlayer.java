package edu.uncc.adapter.mediaplayer;

public interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing "+audioType+". Name: "+fileName);
        } else {
            System.out.println("Invalid Media. "+audioType+" format is not supported");
        }
    }
}
