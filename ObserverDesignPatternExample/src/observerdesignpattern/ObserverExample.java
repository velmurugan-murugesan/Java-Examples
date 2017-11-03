package observerdesignpattern;

public class ObserverExample {

    public static void main(String[] args) {

        Subject subject = new Subject();
        new WatcherOne(subject);
        new WaterTwo(subject);

        subject.setState(true);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        subject.setState(false);

    }
}
