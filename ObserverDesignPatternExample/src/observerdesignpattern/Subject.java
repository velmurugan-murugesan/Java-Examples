package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private boolean state;

    public void setState(boolean state){
        this.state = state;
        notifyAllObservers(state);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(boolean state){
        for (Observer observer: observers) {
            observer.update(state);
        }
    }

}
