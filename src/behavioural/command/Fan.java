package behavioural.command;

public class Fan implements Device {

    @Override
    public void on() {
        System.out.println("Fan is rotating");
    }

    @Override
    public void off() {
        System.out.println("Fan is not rotating");
    }
}
