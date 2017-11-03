package observerdesignpattern;

public abstract class Observer {

    public Subject subject;

    public abstract void update(boolean state);
}
