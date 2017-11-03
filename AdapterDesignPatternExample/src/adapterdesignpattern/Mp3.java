package adapterdesignpattern;

public class Mp3 implements Player {

    @Override
    public void play(String filename) {

        System.out.println("Play Mp3 "+filename);
    }
}
