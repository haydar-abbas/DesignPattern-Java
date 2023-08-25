package behavioural.command;

public class Fan implements Devices {

    public String name = "Fan";

    @Override
    public void on() {
        System.out.println(this.name + " is rotating");
    }

    @Override
    public void off() {
        System.out.println(this.name + " is not rotating");
    }
}
