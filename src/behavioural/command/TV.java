package behavioural.command;

public class TV implements IElectrical {

    public final int SLOT = 0;

    @Override
    public void on() {
        System.out.println("TV is ON!");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF!");
    }
}
