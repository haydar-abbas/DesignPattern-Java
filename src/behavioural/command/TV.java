package behavioural.command;

public class TV implements Electrical {

    public final int SLOT = 0;

    public void on() {
        System.out.println("TV is ON!");
    }

    public void off() {
        System.out.println("TV is OFF!");
    }
}
