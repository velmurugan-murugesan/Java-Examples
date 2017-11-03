package observerdesignpattern;

public class WaterTwo extends Observer {

    public WaterTwo(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(boolean state) {
        System.out.println("WatcherTwo "+state);
    }
}
