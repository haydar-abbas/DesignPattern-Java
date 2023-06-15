package behavioural.template;

public class Truck extends VehicleTemplate {
    @Override
    protected void installGearBox() {
        System.out.println("Install a gearbox of Truck...");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("Assembled all Truck components...");
    }
}
