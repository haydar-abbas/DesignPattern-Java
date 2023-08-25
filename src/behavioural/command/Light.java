package behavioural.command;

public class Light implements Devices {

    public String name = "Light";

    @Override
    public void on() {
        System.out.println(this.name + " is on");
    }

    @Override
    public void off() {
        System.out.println(this.name + " is off");
    }
}
