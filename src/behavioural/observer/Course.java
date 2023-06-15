package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Observable {

    private final String name;
    private String availability;
    private final List<Observer> observers;

    public Course(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void setAvailability(boolean available) {
        this.availability = this.name + (available ? " is available" : " not available");
        notifyAllObservers();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this.availability);
        }
    }
}
