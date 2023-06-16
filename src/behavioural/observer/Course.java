package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Observable {

    private final String name;
    private String status;
    private final List<Observer> observers;

    public Course(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void setStatus(boolean available) {
        this.status = this.name + (available ? " is available" : " not available");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.status);
        }
    }
}
