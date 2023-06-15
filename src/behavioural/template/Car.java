package behavioural.template;

public class Car extends VehicleTemplate{
    @Override
    protected void installGearBox() {
        System.out.println("Installing a gearbox of the Car...");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("Assembled Car components...");
    }
}
