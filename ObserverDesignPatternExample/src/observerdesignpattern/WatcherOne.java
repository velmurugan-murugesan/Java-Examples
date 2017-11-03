package observerdesignpattern;

public class WatcherOne extends Observer {


    public WatcherOne(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(boolean state) {
        System.out.println("WatcherOne "+state);
    }
}
