package behavioural.observer;

public class Student implements Observer{

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s has new notification: %s\n", this.name, message);
    }
}
