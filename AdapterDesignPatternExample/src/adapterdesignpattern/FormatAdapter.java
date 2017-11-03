package adapterdesignpattern;

public class FormatAdapter implements Player {

    VideoPlayer videoPlayer;
    FormatAdapter(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String filename) {
        videoPlayer.play(filename);
    }
}
