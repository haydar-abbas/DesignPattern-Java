package behavioural.command;

public class Satellite implements IElectrical {

    public final int SLOT = 1;

    @Override
    public void on() {
        System.out.println("Satellite is ON!");
    }

    @Override
    public void off() {
        System.out.println("Satellite is OFF!");
    }
}
