package adapterdesignpattern;

public class AdapterDesignPatternMain {

    public static void main(String[] args) {

        VideoPlayer videoPlayer = new Mp4();

        //Play Mp3
        //Player player = new Mp3();

        //Play Mp4
        Player player = new FormatAdapter(videoPlayer);
        player.play("file");

    }
}
