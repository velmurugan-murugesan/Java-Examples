package adapterdesignpattern;

public class Mp4 implements VideoPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing Mp4 "+filename);
    }
}
